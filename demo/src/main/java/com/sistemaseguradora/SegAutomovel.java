package com.sistemaseguradora;

public class SegAutomovel extends Seguro {

    private String chassi;
    private float valorApolice;

    public SegAutomovel(String beneficiario, float valorApolice, String chassi, float valorApolice1) {
        super(beneficiario, valorApolice);
        this.chassi = chassi;
        this.valorApolice = valorApolice1;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public float getValorApolice() {
        return valorApolice;
    }

    public void setValorApolice(float valorApolice) {
        this.valorApolice = valorApolice;
    }

    public float calcValor() {

    }

}
