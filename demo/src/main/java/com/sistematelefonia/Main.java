package com.sistematelefonia;

public class Main {
    public static void main(String[] args) {
        Tempo inicioAtual = new Tempo(1,20,0);
        Ligacao minhaLigacao = new Ligacao(inicioAtual, "salvador", "00000-0000", "11111-1111");
        
        int inicio = inicioAtual.conversao(1,20,0);

        Tempo fimAtual = new Tempo(2,20,10);
        int fim = fimAtual.conversao(2,20,10);

        int duracaoLigacao = inicioAtual.calcDiff(inicio,fim);

        System.out.println(minhaLigacao.calcValor(duracaoLigacao));

        minhaLigacao.verificaNumero("20000-0000");

    }
}