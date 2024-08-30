package com.br.elton.designer.patterns.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@ComponentScan("com.br.elton.designer.patterns.*")
@EnableJpaRepositories("com.br.elton.designer.patterns.integration.db.repository")
@EntityScan("com.br.elton.designer.patterns.integration.db.entity")
@EnableFeignClients("com.br.elton.designer.patterns.integration.feign.client")
@EnableRetry
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
	}

}
