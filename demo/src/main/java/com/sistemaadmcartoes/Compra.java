package com.sistemaadmcartoes;

public class Compra {

    String nomeEstabelecimento, dataCompra;
    float valorCompra;
    int parcelas;
    Cartao cartaoUsado;

    public Compra(String nomeEstabelecimento, String dataCompra, float valorCompra, int parcelas, Cartao cartaoUsado) {
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.dataCompra = dataCompra;
        this.valorCompra = valorCompra;
        this.parcelas = parcelas;
        this.cartaoUsado = cartaoUsado;
    }

    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public void setNomeEstabelecimento(String nomeEstabelecimento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public Cartao getCartaoUsado() {
        return cartaoUsado;
    }

    public void setCartaoUsado(Cartao cartaoUsado) {
        this.cartaoUsado = cartaoUsado;
    }
}
