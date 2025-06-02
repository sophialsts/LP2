package com.sistemapedagio;

public class AutomovelCarga extends Automovel {

    protected float peso;

    public AutomovelCarga(String placa, int anoFab, float peso) {
        super(placa, anoFab);
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float cobraPassagem(Passagem novaPassagem) {
        return peso*2; //2 reais por kilo
    }

}
