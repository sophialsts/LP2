package com.sistematelefonia;

public class ContaTelefonica {

    private int mes,ano;
    private String numeroContrato;
    private Ligacao[] ligacoes = null;

    public ContaTelefonica(int ano, int mes, String numeroContrato) { //cria uma conta telefônica nova
        this.ano = ano;
        this.mes = mes;
        this.numeroContrato = numeroContrato;
        this.ligacoes = new Ligacao[20];
    }

    public float calcConta() {
        int totalConta = 0;
        int i = 0;

        while(this.ligacoes[i] != null) {
            totalConta += this.ligacoes[i].getValorTotal();
            i++;
        }

        return totalConta;

    }

    public float calcConta(String  localD) { //calcular conta das ligações somente pra um determinado destino

        float totalContaDestino = 0;
        int i = 0;

        //System.out.println(this.ligacoes[i].getLocalDestino());

        while(this.ligacoes[i] != null) {
            if(localD.equals(this.ligacoes[i].getLocalDestino())) totalContaDestino += this.ligacoes[i].getValorTotal();
            i++;
        }

        return totalContaDestino;

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public Ligacao getLigacoes(int i) {
        return ligacoes[i];
    }

    public void setLigacoes(Ligacao ligacao) {
        int i = 0;

        if(this.ligacoes[i] == null) this.ligacoes[i] = ligacao;
        else {
            while(this.ligacoes[i] != null) {
                i++;
            }

            this.ligacoes[i] = ligacao;
        }
    }

}
