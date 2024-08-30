package com.br.elton.designer.patterns.rest.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CardRequest {

    @JsonProperty(value = "key")
    String key;

    @JsonProperty(value = "flag")
    String flag;

    @JsonProperty(value = "cpf")
    String cpf;

    @JsonProperty(value = "card_type")
    String cardType;

}
