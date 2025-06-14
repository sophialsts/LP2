package com.sistemapedagio;

public class AutomovelPasseio extends Automovel {

    protected int quantPassageiros;

    public AutomovelPasseio(String placa, int anoFab, int quantPassageiros) {
        super(placa, anoFab);
        this.quantPassageiros = quantPassageiros;
    }

    public int getQuantPassageiros() {
        return quantPassageiros;
    }

    public void setQuantPassageiros(int quantPassageiros) {
        this.quantPassageiros = quantPassageiros;
    }

    public float cobraPassagem() {
        return 5*quantPassageiros; //5 reais por pessoa
    }
}
