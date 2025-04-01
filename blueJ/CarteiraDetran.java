package blueJ;

public class CarteiraDetran
{  
    int pontos, numeroCarteira;
    String tipoCarteira;
    long CPF;
    boolean validade;
    int mesAtual, anoAtual, mesExpedicao, anoExpedicao;
    
    CarteiraDetran (int num, long cpf, String tipo, int mesA, int anoA, int mesE, int anoE) {
        this.tipoCarteira = tipo;
        this.pontos = 0;
        this.CPF = cpf;
        this.numeroCarteira = num;
        this.validade = true;
        this.mesAtual = mesA;
        this.anoAtual = anoA;
        this.mesExpedicao = mesE;
        this.anoExpedicao = anoE;
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
        if(this.anoAtual - this.anoExpedicao >= 10){
            if(this.anoAtual - this.anoExpedicao == 10) {
                if(this.mesExpedicao <= this.mesAtual) System.out.println("Sua carteira esta vencida.");
                else {
                    if(this.validade) System.out.println("Sua carteira esta valida.");
                    else System.out.println("Sua carteira nao esta valida.");
                }
            }
            else System.out.println("Sua carteira esta vencida.");
        }
        else if(this.validade) {
            System.out.println("Sua carteira esta valida");
        }
        else System.out.println("Sua carteira nao esta valida");
    }
    
}
