package com.sistemapedagio;

public class AutomovelPequeno extends Automovel {

        protected String modelo;

    public AutomovelPequeno(String placa, int anoFab, String modelo) {
        super(placa, anoFab);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
