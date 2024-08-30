package com.br.elton.designer.patterns.integration.feign.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CodeResponse {

    @JsonProperty("deck_id")
    private String deckId;

    @JsonProperty("success")
    private String success;

    @JsonProperty("shuffled")
    private String shuffled;

    @JsonProperty("remaining")
    private String remaining;

}
