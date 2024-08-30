package com.br.elton.designer.patterns.domain.port;

import com.br.elton.designer.patterns.domain.model.CardModel;

import java.util.List;

public interface CardPort {

    List<CardModel> getInfoCard(CardModel card);

    CardModel saveCard(CardModel card);

}
