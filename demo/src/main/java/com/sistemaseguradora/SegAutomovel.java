package com.sistemaseguradora;

public class SegAutomovel extends Seguro {

    private String chassi;
    private int anoFabricacao;

    public SegAutomovel(String beneficiario, float valorApolice, String chassi, int anoFabricacao) {
        super(beneficiario, valorApolice);
        this.chassi = chassi;
        this.anoFabricacao = anoFabricacao;
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
        float depreciacao = 0;

        for(int i=0; i<2025-anoFabricacao;i++) depreciacao += (float) (valorApolice*0.02);

        return (float) (0.9*valorApolice) - depreciacao;
    }

    public void imprimir() {
        System.out.println("Nome do beneficiário:" + beneficiario);
        System.out.println("Valor da apolice:" + valorApolice);
        System.out.println("Chassi:" + chassi);
        System.out.println("Ano de fabricação:" + anoFabricacao);
    }

}
