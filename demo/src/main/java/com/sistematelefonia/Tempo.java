package com.sistematelefonia;

public class Tempo {
    private int hora, minuto, segundo;

    public Tempo(int h, int m, int s) {
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    public int conversao(int hora, int minuto, int segundo) {
        int total = hora*60*60+minuto*60+segundo; //transformar tudo em segundos

        return total;
    }

    public int calcDiff(int inicio, int fim) {
        int duracao = fim - inicio;

        if(duracao % 60 != 0) {
            duracao -= (duracao%60);
            duracao /= 60;
            duracao++;
        }
        else {
            duracao /= 60;
        }

        return duracao; //duração em minutos já contando se tiver segundos a mais que 0
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

}
