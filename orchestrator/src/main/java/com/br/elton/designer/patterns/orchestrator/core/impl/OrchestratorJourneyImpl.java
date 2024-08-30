package com.br.elton.designer.patterns.orchestrator.core.impl;

import com.br.elton.designer.patterns.domain.model.CardModel;
import com.br.elton.designer.patterns.domain.strategy.CardStrategy;
import com.br.elton.designer.patterns.orchestrator.core.OrchestratorJourney;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class OrchestratorJourneyImpl implements OrchestratorJourney {

    private final Map<String, CardStrategy> journeyStrategyMap;

    @Override
    public List<CardModel> execute(CardModel card) {

        CardStrategy cardStrategy = this.journeyStrategyMap.get(card.getCardType());

        return cardStrategy.execute(card);
    }

    @Override
    public CardModel save(CardModel card) throws Exception {
        CardStrategy cardStrategy = this.journeyStrategyMap.get(card.getCardType());

        return cardStrategy.save(card);
    }

}
