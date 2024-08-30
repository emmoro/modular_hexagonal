package com.br.elton.designer.patterns.rest.controller;

import com.br.elton.designer.patterns.rest.request.CardRequest;
import com.br.elton.designer.patterns.rest.response.CardResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.List;

public interface CardController {

    @ResponseStatus(HttpStatus.OK)
    @PostMapping(value = "/information", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<CardResponse>> getInfoCard(@RequestBody final CardRequest cardRequestT);

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CardResponse> saveCard(@RequestBody final CardRequest cardRequest) throws Exception;

}
