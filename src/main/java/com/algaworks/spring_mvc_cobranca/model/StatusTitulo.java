package com.algaworks.spring_mvc_cobranca.model;

public enum StatusTitulo {

    PENDENTE("Pendente"),
    RECEBIDO("Recebido");

    private String descricao;

    StatusTitulo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
