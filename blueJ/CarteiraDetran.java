package blueJ;
 
public class CarteiraDetran
{  
    private int pontos, numeroCarteira;
    private String tipoCarteira;
    private long CPF;
    private boolean validade;
    private int mesAtual, anoAtual, mesExpedicao, anoExpedicao;
    
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
    
    public int getPontos () {
        return this.pontos;
    }
    public int getNumero () {
        return this.numeroCarteira;
    }
    public String getTipo () {
        return this.tipoCarteira;
    }
    public long getCpf () {
        return this.CPF;
    }
    public boolean getValidade () {
        return this.validade;
    }
    public int getMesA () {
        return this.mesAtual;
    }
    public int getMesE () {
        return this.mesExpedicao;
    }
    public int getAnoA () {
        return this.anoAtual;
    }
    public int getAnoE () {
        return this.anoExpedicao;
    }
 
    public void setPontos (int p) {
        this.pontos = p;
    }
    public void setNumero (int n) {
        this.numeroCarteira = n;
    }
    public void setTipo (String t) {
        this.tipoCarteira = t;
    }
    public void setCpf (long cpf) {
        this.CPF = cpf;
    }
    public void setValidade (boolean v) {
        this.validade = v;
    }
    public void setMesA (int mesA) {
        this.mesAtual = mesA;
    }
    public void setMesE (int mesE) {
        this.mesExpedicao = mesE;
    }
    public void setAnoA (int anoA) {
        this.anoAtual = anoA;
    }
    public void setAnoE (int anoE) {
        this.anoExpedicao = anoE;
    }
    
    void aumentarPontos (int p) {
        this.setPontos(this.getPontos() + p);
        if (this.getPontos() > 20){ //verifica se carteira vai ser apreendida
            this.validade = false;
            System.out.println("Sua carteira foi apreendida.");
        }
    }
    void consultaSaldo () {
        System.out.println("Sua carteira esta marcada com: " + this.getPontos() + " pontos.");
    }
    void zerarCarteira () {
        this.setPontos(0);
        this.setValidade(true);
    }
    void verificaValidade () {
        if(this.getAnoA() - this.getAnoE() >= 10){
            if(this.getAnoA() - this.getAnoE() == 10) {
                if(this.getMesE() <= this.getMesA()) System.out.println("Sua carteira esta vencida.");
                else {
                    if(this.getValidade()) System.out.println("Sua carteira esta valida.");
                    else System.out.println("Sua carteira nao esta valida.");
                }
            }
            else System.out.println("Sua carteira esta vencida.");
        }
        else if(this.getValidade()) {
            System.out.println("Sua carteira esta valida");
        }
        else System.out.println("Sua carteira nao esta valida");
    }
}