package com.br.elton.designer.patterns.integration.db.repository;

import com.br.elton.designer.patterns.integration.db.entity.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, Long> {

    List<CardEntity> findByCpfAndCardType(String cpf, String cardType);

}
