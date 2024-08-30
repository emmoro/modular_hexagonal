package com.br.elton.designer.patterns.rest.controller.impl;

import com.br.elton.designer.patterns.domain.model.CardModel;
import com.br.elton.designer.patterns.orchestrator.core.OrchestratorJourney;
import com.br.elton.designer.patterns.rest.controller.CardController;
import com.br.elton.designer.patterns.rest.request.CardRequest;
import com.br.elton.designer.patterns.rest.response.CardResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1")
public class CardControllerImpl implements CardController {

    private final OrchestratorJourney orchestratorJourney;

    private final ModelMapper modelMapper;

    @Override
    public ResponseEntity<List<CardResponse>> getInfoCard(CardRequest cardRequest) {

        List<CardModel> cards = orchestratorJourney.execute(modelMapper.map(cardRequest, CardModel.class));

        return ResponseEntity.status(HttpStatus.OK)
                .body(cards.stream()
                        .map(ca -> modelMapper.map(ca, CardResponse.class))
                        .collect(Collectors.toList()));
    }

    @Override
    public ResponseEntity<CardResponse> saveCard(CardRequest cardRequest) throws Exception {

        CardModel card = orchestratorJourney.save(modelMapper.map(cardRequest, CardModel.class));
        return ResponseEntity.status(HttpStatus.OK)
                .body(modelMapper.map(card, CardResponse.class));
    }

}
