package com.sistemaseguradora;

abstract class Seguro {
    String beneficiario;
    float valorApolice;

    //esse método construtor não é usado para instanciar um objeto dessa classe
    // mas para instanciar esse atributos nas suas classes filhas
    public Seguro(String beneficiario, float valorApolice) {
        this.beneficiario = beneficiario;
        this.valorApolice = valorApolice;
    }

    public abstract float calcValor();

}
