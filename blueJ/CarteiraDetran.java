package blueJ;

public class CarteiraDetran
{  
    int pontos;
    boolean validade;
    
    CarteiraDetran () {
        this.pontos = 0;
        this.validade = true;
    }
    
    void aumentarPontos (int p) {
        this.pontos += p;
        if (this.pontos > 20){ //verifica se carteira vai ser apreendida
            this.validade = false;
        }
    }
    
    void consultaSaldo () {
        System.out.println("Sua carteira esta marcada com: " + this.pontos + " pontos.");
    }
    
    void zerarCarteira () {
        this.pontos = 0;
        this.validade = true;
    }
    
    void verificaValidade () {
        if (this.validade) System.out.println("Sua carteira esta valida.");
        else System.out.println("Sua carteira nao esta valida.");
    }
    
}
