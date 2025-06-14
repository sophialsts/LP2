package com.sistemaadmcartoes;

public class CartaoUniversitario extends Cartao {

    String instituicao;
    int pontos;

    public CartaoUniversitario(int codP, int codS, String dataExp, String dataVal, String instituicao) {
        super(codP, codS, 300f, dataExp, dataVal);
        this.instituicao = instituicao;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    @Override
    public int calcPontosCompra(float valorGasto) {
        this.pontos += (int)valorGasto;
        return (int)valorGasto;
    }

}
