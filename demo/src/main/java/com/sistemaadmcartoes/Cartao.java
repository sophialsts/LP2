package com.sistemaadmcartoes;

abstract class Cartao {

    int codP, codS;
    float limite;
    String dataExp, dataVal;

    public Cartao(int codP, int codS, float limite, String dataExp, String dataVal) {
        this.codP = codP;
        this.codS = codS;
        this.limite = limite;
        this.dataExp = dataExp;
        this.dataVal = dataVal;
    }

    public int getCodP() {
        return codP;
    }

    public void setCodP(int codP) {
        this.codP = codP;
    }

    public int getCodS() {
        return codS;
    }

    public void setCodS(int codS) {
        this.codS = codS;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getDataExp() {
        return dataExp;
    }

    public void setDataExp(String dataExp) {
        this.dataExp = dataExp;
    }

    public String getDataVal() {
        return dataVal;
    }

    public void setDataVal(String dataVal) {
        this.dataVal = dataVal;
    }

    public abstract int calcPontosCompra(float valorGasto);

}
