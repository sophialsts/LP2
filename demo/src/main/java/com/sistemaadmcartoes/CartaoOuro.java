package com.sistemaadmcartoes;

public class CartaoOuro extends Cartao {

    int pontos;

    public CartaoOuro(int codP, int codS, String dataExp, String dataVal) {
        super(codP, codS, 1000000f, dataExp, dataVal);
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public int calcPontosCompra(float valorGasto) {
        this.pontos += ((int)valorGasto*2);
        return (int)valorGasto*2;
    }

}
