package com.br.elton.designer.patterns.orchestrator.core;

import com.br.elton.designer.patterns.domain.model.CardModel;

import java.util.List;

public interface OrchestratorJourney {

    List<CardModel> execute(final CardModel card);

    CardModel save(final CardModel card) throws Exception;

}
