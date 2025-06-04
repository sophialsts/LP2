package com.sistemaseguradora;

public class SegAutomovel extends Seguro {
    @Override
    public String toString() {
        return "SegAutomovel{" +
            "chassi='" + chassi + '\'' +
            ", nomeBeneficiario='" + nomeBeneficiario + '\'' +
            ", valorApolice=" + valorApolice +
            ", anoFabricacao=" + anoFabricacao +
            '}';
    }

    private String chassi, nomeBeneficiario;
    private float valorApolice;
    private int anoFabricacao;

    public SegAutomovel(String beneficiario, float valorApolice, String chassi, String nomeBeneficiario, float valorApolice1, int anoFabricacao) {
        super(beneficiario, valorApolice);
        this.chassi = chassi;
        this.nomeBeneficiario = nomeBeneficiario;
        this.valorApolice = valorApolice1;
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

        for(int i=0; i<2025-anoFabricacao; i++) {
            depreciacao += (float) (valorApolice*0.2);
        }

        return (float) 0.9*valorApolice - depreciacao;
    }

}
