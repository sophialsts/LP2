package com.sistemapedagio;
import java.util.ArrayList;

public abstract class Automovel {

    private String placa;
    private int anoFab;
    private ArrayList<Passagem> passagens;

    public Automovel(String placa, int anoFab) {
        this.placa = placa;
        this.anoFab = anoFab;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public void addPassagem(Passagem novaPassagem) {
        this.passagens.add(novaPassagem);
    }

    public abstract float cobraPassagem(); //do automovel pequeno é o genérico

    public int qtdPassagens() {
        return this.passagens.size();
    }
}
