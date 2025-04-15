package blueJ;


public class Tempo {
    private int hora, minuto, segundo;
    
    public Tempo() {
        
    }

    public int conversao(int hora, int minuto, int segundo) {
        int total = hora*60+minuto;
        
        if(segundo > 0) total+=1;
        
        return total;
    }
    
    int calcDiff(int inicio, int fim) {
        int diferenca = fim - inicio;
        return diferenca;
    }
    
}
