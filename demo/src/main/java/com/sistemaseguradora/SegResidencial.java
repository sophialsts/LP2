package com.sistemaseguradora;

public class SegResidencial extends Seguro implements Print {

    private String endereco;
    private int anoConstrucao;

    public SegResidencial(String beneficiario, float valorApolice, String endereco, int anoConstrucao) {
        super(beneficiario, valorApolice);
        this.endereco = endereco;
        this.anoConstrucao = anoConstrucao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    public void setAnoConstrucao(int anoConstrucao) {
        this.anoConstrucao = anoConstrucao;
    }

    public float calcValor() {


    }
}
