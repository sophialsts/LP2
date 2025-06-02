package com.sistemaseguradora;

public class SegVida extends Seguro {

    private int idadeSegurado;

    public SegVida(String beneficiario, float valorApolice, int idadeSegurado) {
        super(beneficiario, valorApolice);
        this.idadeSegurado = idadeSegurado;
    }

    public int getIdadeSegurado() {
        return idadeSegurado;
    }

    public void setIdadeSegurado(int idadeSegurado) {
        this.idadeSegurado = idadeSegurado;
    }

    public float calcValor() {
        if(idadeSegurado < 50) {
            return (float) (valorApolice*1.1);
        }
        return 0;
    }

}
