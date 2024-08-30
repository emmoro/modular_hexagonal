package com.br.elton.designer.patterns.domain.enums;

public enum CardType {

    CREDITO("credito"),
    DEBITO("debito"),
    VOUCHER("voucher");

    private String descricao;

    CardType(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
