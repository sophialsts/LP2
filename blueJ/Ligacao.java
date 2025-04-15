package blueJ;


public class Ligacao {
    private int numeroOrigem, numeroDestino;
    String localidade;
    float valorTotal;
    Tempo momentoInicio, momentoFim;
    
    public Ligacao() {
    }
    
    public float calcValor(int segundo, int minuto, int hora) {
        Tempo atual;
        this.valorTotal = 1* atual.conversao(segundo, minuto, hora);
        return this.valorTotal;
    }
}
