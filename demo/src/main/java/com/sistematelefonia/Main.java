package com.sistematelefonia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a hora, o minuto e o segundo que a ligação começou.");
        int horaInicio = ler.nextInt();
        int minutoInicio = ler.nextInt();
        int segundoInicio = ler.nextInt();
        Tempo inicioAtual = new Tempo(horaInicio,minutoInicio,segundoInicio);
        int inicio = inicioAtual.conversao(horaInicio,minutoInicio,segundoInicio);
        Ligacao minhaLigacao1 = new Ligacao(inicioAtual, "salvador", "00000-0000", "11111-1111");
        minhaLigacao1.setLocalDestino("camaçari");
        
        //1º ligação
        System.out.println("Digite a hora, o minuto e o segundo que a ligação terminou.");
        int horaFim = ler.nextInt();
        int minutoFim = ler.nextInt();
        int segundoFim = ler.nextInt();
        Tempo fimAtual = new Tempo(2,20,10);
        int fim = fimAtual.conversao(horaFim,minutoFim,segundoFim);

        /*a lógica se somar 1 quando segundos for maior que 0 ñ funciona em conversao, corrigir isso em calcDiff passando os segundos do inicio e fim*/

        int duracaoLigacao = inicioAtual.calcDiff(inicio,fim);

        System.out.println(minhaLigacao1.calcValor(duracaoLigacao));

        minhaLigacao1.verificaNumero("00000-0000");

        System.out.println("---------------------------------------------------");

        System.out.println("Digite a hora, o minuto e a segunda que a ligação começou.");
        int horaInicio2 = ler.nextInt();
        int minutoInicio2 = ler.nextInt();
        int segundoInicio2 = ler.nextInt();
        Tempo inicioAtual2 = new Tempo(horaInicio2, minutoInicio2, segundoInicio2);
        int inicio2 = inicioAtual2.conversao(horaInicio2,minutoInicio2,segundoInicio2);
        Ligacao minhaLigacao2 = new Ligacao(inicioAtual2, "camaçari", "10000-0000", "11111-1110");
        minhaLigacao2.setLocalDestino("salvador");

        System.out.println("Digite a hora, o minuto e o segundo que a ligação terminou.");
        int horaFim2 = ler.nextInt();
        int minutoFim2 = ler.nextInt();
        int segundoFim2 = ler.nextInt();
        Tempo fimAtual2 = new Tempo(2,20,10);
        int fim2 = fimAtual2.conversao(horaFim2,minutoFim2,segundoFim2);

        int duracaoLigacao2 = inicioAtual.calcDiff(inicio2,fim2);

        System.out.println(minhaLigacao2.calcValor(duracaoLigacao2));

        minhaLigacao2.verificaNumero("11111-1110");

        ContaTelefonica novaConta = new ContaTelefonica(2025, 8, "99999-9999");
        novaConta.setLigacoes(minhaLigacao1);
        novaConta.setLigacoes(minhaLigacao2);

        System.out.println(novaConta.calcConta());
        System.out.println(novaConta.calcConta("camaçari")); //isso aqui não tá funcionando

        ler.close();
    }
}