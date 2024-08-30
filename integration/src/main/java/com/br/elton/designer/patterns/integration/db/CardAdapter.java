package com.br.elton.designer.patterns.integration.db;

import com.br.elton.designer.patterns.domain.model.CardModel;
import com.br.elton.designer.patterns.domain.port.CardPort;
import com.br.elton.designer.patterns.integration.db.entity.CardEntity;
import com.br.elton.designer.patterns.integration.db.repository.CardRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CardAdapter implements CardPort {

    private final CardRepository cardRepository;

    private final ModelMapper modelMapper;

    @Override
    public List<CardModel> getInfoCard(CardModel card) {
        var result = cardRepository.findByCpfAndCardType(card.getCpf(), card.getCardType());

        return  result.stream()
                .map(ca -> modelMapper.map(ca, CardModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public CardModel saveCard(CardModel card) {
        var newCard = cardRepository.saveAndFlush(modelMapper.map(card, CardEntity.class));
        return modelMapper.map(newCard, CardModel.class);
    }

}