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
        float depreciacao = 0;

        for(int i=0; i<2025-anoConstrucao;i++) depreciacao += (float) (valorApolice*0.002);

        return valorApolice-depreciacao;

    }

    public void imprimir() {
        System.out.println("Nome do beneficiário:" + beneficiario);
        System.out.println("Valor da apolice:" + valorApolice);
        System.out.println("Endereço:" + endereco);
        System.out.println("Ano de Construção:" + anoConstrucao);
    }

}
