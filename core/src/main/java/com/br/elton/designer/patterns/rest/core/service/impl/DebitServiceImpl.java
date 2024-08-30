package com.br.elton.designer.patterns.rest.core.service.impl;

import com.br.elton.designer.patterns.domain.model.CardModel;
import com.br.elton.designer.patterns.domain.port.CardCodePort;
import com.br.elton.designer.patterns.domain.port.CardPort;
import com.br.elton.designer.patterns.rest.core.service.DebitService;
import com.br.elton.designer.patterns.rest.core.utils.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Component(value = "debit")
public class DebitServiceImpl implements DebitService {

     /*
      Create specific rules to debit card
     */

    private final CardPort cardPort;

    private final CardCodePort cardCodePort;

    @Override
    public List<CardModel> execute(CardModel card) {
        return cardPort.getInfoCard(card);
    }

    @Override
    public CardModel save(CardModel card) throws Exception {
        LocalDate currentDate = LocalDate.now();
        currentDate = currentDate.plusYears(7L);
        card.setExpirationDate(Utils.getMonthAndYear(currentDate));

        card.setKey(cardCodePort.getCardKey());
        return cardPort.saveCard(card);
    }

}
