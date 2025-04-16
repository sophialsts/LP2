package com.sistematelefonia;

public class Ligacao {
    private String numeroReferente, localOrigem, numeroDestino, localDestino;
    private float valorTotal;
    private Tempo momentoInicio, momentoFim;
    
    public Ligacao(Tempo inicio, String localOrigem, String numeroRef, String numeroDest) {
        this.momentoInicio = inicio;
        this.localOrigem = localOrigem;
        this.numeroReferente = numeroRef;
        this.numeroDestino = numeroDest;
    }
    
    public float calcValor(int duracao) { 

        setValorTotal(1*duracao);

        return this.valorTotal;
    }

    public String getNumeroReferente() {
        return numeroReferente;
    }

    public void setNumeroReferente(String numeroReferente) {
        this.numeroReferente = numeroReferente;
    }

    public String getLocalOrigem() {
        return localOrigem;
    }

    public void setLocalOrigem(String localOrigem) {
        this.localOrigem = localOrigem;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public String getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(String localDestino) {
        this.localDestino = localDestino;
    }

    public Tempo getMomentoInicio() {
        return momentoInicio;
    }

    public void setMomentoInicio(Tempo momentoInicio) {
        this.momentoInicio = momentoInicio;
    }

    public Tempo getMomentoFim() {
        return momentoFim;
    }

    public void setMomentoFim(Tempo momentoFim) {
        this.momentoFim = momentoFim;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
}

