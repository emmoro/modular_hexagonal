package com.br.elton.designer.patterns.integration.db.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "card")
public class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "flag")
    private String flag;

    @Column(name = "card_type")
    private String cardType;

    @Column(name = "expiration_date")
    private String expirationDate;

    @Column(name = "key")
    private String key;

    @Column(name = "cpf")
    private String cpf;

}