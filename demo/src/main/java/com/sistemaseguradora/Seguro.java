package com.sistemaseguradora;

abstract class Seguro {
    String beneficiario;
    float valorApolice;

    public Seguro(String beneficiario, float valorApolice) {
        this.beneficiario = beneficiario;
        this.valorApolice = valorApolice;
    }

    public abstract float calcValor();

}
