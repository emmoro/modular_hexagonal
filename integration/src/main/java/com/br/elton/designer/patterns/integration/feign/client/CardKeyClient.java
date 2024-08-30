package com.br.elton.designer.patterns.integration.feign.client;

import com.br.elton.designer.patterns.integration.feign.response.CodeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "code-client", url = "${code.url}")
public interface CardKeyClient {

    @GetMapping(value = "${code.endpoint}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    CodeResponse getCodeKey();

}