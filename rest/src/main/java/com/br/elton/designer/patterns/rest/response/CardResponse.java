package com.br.elton.designer.patterns.rest.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CardResponse {

    @JsonProperty(value = "key")
    private String key;

    @JsonProperty(value = "flag")
    private String flag;

    @JsonProperty(value = "cpf")
    private String cpf;

    @JsonProperty(value = "card_type")
    private String cardType;

    @JsonProperty(value = "expiration_date")
    private String expirationDate;

}
