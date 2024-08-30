package com.br.elton.designer.patterns.orchestrator.config;

import com.br.elton.designer.patterns.domain.strategy.CardStrategy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class StrategyConfig {

    @Bean
    public Map<String, CardStrategy> strategies(
            @Qualifier("credit") CardStrategy cardStrategyCredit,
            @Qualifier("debit") CardStrategy cardStrategyDebit,
            @Qualifier("voucher") CardStrategy cardStrategyVoucher) {

        Map<String, CardStrategy> strategyMap = new HashMap<>();
        strategyMap.put("credit", cardStrategyCredit);
        strategyMap.put("debit", cardStrategyDebit);
        strategyMap.put("voucher", cardStrategyVoucher);
        return strategyMap;
    }

}
