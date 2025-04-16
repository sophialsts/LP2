public class CarteiraDetran {  
    private int pontos, numeroCarteira;
    private String tipoCarteira, nome;
    private long CPF;
    private boolean validade;
    private int mesAtual, anoAtual, mesExpedicao, anoExpedicao;
    
    CarteiraDetran (int num, long cpf, String tipo, String name, int mesA, int anoA, int mesE, int anoE) {
        this.nome = name;
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
                    else {
                        System.out.println("Sua carteira nao esta valida.");
                        this.validade = false;
                    }
                }
            }
            else {
                System.out.println("Sua carteira esta vencida.");
                this.validade = false;
            }
        }
        else if(this.validade) {
            System.out.println("Sua carteira esta valida");
        }
        else {
            System.out.println("Sua carteira nao esta valida");
            this.validade = false;
        }
    }

    public void mostrarCarteira() {
        System.out.println("Nome: " + this.nome + " , Número da Carteira: " + this.numeroCarteira + " , Tipo: " + this.tipoCarteira + " ,com número de CPF: " + this.CPF);
        if(this.validade) System.out.println("A situação atual da carteira é válida.");
        else System.out.println("A situação atual da carteira é não válida.");
        System.out.println("Foi expedida em: " + this.mesExpedicao + "/" + this.anoExpedicao + " e está marcada com " + this.pontos + " pontos.");
    } 
    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public int getNumeroCarteira() {
        return numeroCarteira;
    }

    public void setNumeroCarteira(int numeroCarteira) {
        this.numeroCarteira = numeroCarteira;
    }

    public String getTipoCarteira() {
        return tipoCarteira;
    }

    public void setTipoCarteira(String tipoCarteira) {
        this.tipoCarteira = tipoCarteira;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCPF(long CPF) {
        this.CPF = CPF;
    }

    public boolean isValidade() {
        return validade;
    }

    public void setValidade(boolean validade) {
        this.validade = validade;
    }

    public int getMesAtual() {
        return mesAtual;
    }

    public void setMesAtual(int mesAtual) {
        this.mesAtual = mesAtual;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getMesExpedicao() {
        return mesExpedicao;
    }

    public void setMesExpedicao(int mesExpedicao) {
        this.mesExpedicao = mesExpedicao;
    }

    public int getAnoExpedicao() {
        return anoExpedicao;
    }

    public void setAnoExpedicao(int anoExpedicao) {
        this.anoExpedicao = anoExpedicao;
    }
    
    public static void main(String[] args) {
        CarteiraDetran novaCarteira = new CarteiraDetran(15, 10000000000l, "AB", "Sophia", 9, 2025, 10, 2011);
        novaCarteira.verificaValidade();
        novaCarteira.mostrarCarteira();
        novaCarteira.aumentarPontos(5);
        novaCarteira.consultaSaldo();
        novaCarteira.zerarCarteira();
    }

}




