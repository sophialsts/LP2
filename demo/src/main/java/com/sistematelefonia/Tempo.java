package com.sistematelefonia;

public class Tempo {
    private int hora, minuto, segundo;

    public Tempo(int h, int m, int s) {
        this.hora = h;
        this.minuto = m;
        this.segundo = s;
    }

    public int conversao(int hora, int minuto, int segundo) {
        int total = hora*60+minuto;
        
        return total;
    }
    
    public int calcDiff(int inicio, int fim) {
        int diferenca = fim - inicio;
        return diferenca;
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
