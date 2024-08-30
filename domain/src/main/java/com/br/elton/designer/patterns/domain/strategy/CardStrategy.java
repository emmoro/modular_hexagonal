package com.br.elton.designer.patterns.domain.strategy;

import com.br.elton.designer.patterns.domain.model.CardModel;

import java.util.List;

public interface CardStrategy {

    List<CardModel> execute(CardModel card);

    CardModel save(CardModel card) throws Exception;

}
