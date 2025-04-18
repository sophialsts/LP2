package com.sistemafarmacia;

public class Fabricante {
    private long cnpj;
    String nomeFantasia, endereco;
    private float percentual;

    public Fabricante(long cnpj, String nomeFantasia, String endereco, float percentual) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
        this.percentual = percentual;
    }

    public void setPercentual(float percentual){
        this.percentual = percentual;
    }

    public float getPercentual() {
        return this.percentual;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
}