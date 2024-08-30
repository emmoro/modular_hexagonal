package com.br.elton.designer.patterns.integration.feign;

import com.br.elton.designer.patterns.domain.port.CardCodePort;
import com.br.elton.designer.patterns.integration.feign.client.CardKeyClient;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CardKeyAdapter implements CardCodePort {

    private static final Logger log = LoggerFactory.getLogger(CardKeyAdapter.class);

    private final CardKeyClient cardKeyClient;

    @Retryable(
            value = Exception.class,
            maxAttempts = 3,
            backoff = @Backoff(delay = 5000))
    @Override
    public String getCardKey() throws Exception {
        try {
            var result = cardKeyClient.getCodeKey();
            return result.getDeckId();
        } catch (Exception e) {
            log.error(" Error to call the external api : " + e.getMessage());
            throw new Exception(e.getMessage());
        }
    }

}



