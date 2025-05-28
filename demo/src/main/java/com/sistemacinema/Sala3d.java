package com.sistemacinema;

public class Sala3d extends Sala {
    protected String equipamentoProj;

    public Sala3d(int numSala, int capacidadeP, String equipamentoProj) {
        super(numSala, capacidadeP);
        this.equipamentoProj = equipamentoProj;
    }

}
