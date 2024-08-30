package com.br.elton.designer.patterns.domain.model;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardModel {

    private Long id;

    private String flag;

    private String cardType;

    private String expirationDate;

    private String key;

    private String cpf;

}