package blueJ;
 
public class Medicamento {
    private Fabricante produtor;
    private float precoCusto;
    private String nome, principioAtv;

    public void setNome(String n){
        this.nome = n;
    }
    public void setPrecoC(float p){
        this.precoCusto = p;
    }
    public void setPrincipio(String p){
        this.principioAtv = p;
    }
    public String getNome() {
        return this.nome;
    }
    public void setProdutor(Fabricante p) {
        this.produtor = p;
    }
    public String getPrincipio() {
        return this.principioAtv;
    }
    public float getPrecoC() {
        return this.precoCusto;
    }
    public Fabricante getProdutor() {
        return this.produtor;
    }
    //se o nome do principio ativo e o nome forem iguais
    public Medicamento(String nome, float precoCusto){
        this(nome, nome, precoCusto,null);
    }
    public Medicamento(String nome, String principio, float precoC, Fabricante produtor ){
        this.nome = nome;
        this.precoCusto = precoC;
        this.principioAtv = principio;
        this.produtor = produtor;
    }
    public boolean generico(Medicamento outro) {
        if(this.principioAtv.equals(outro.getPrincipio())) return true;
        else return false;
    }
    public float calcPrecoVenda(float percentual) {
        return this.precoCusto + this.precoCusto*percentual/100;
    }
    public float calcPrecoVenda() {
        float perc;
        perc = produtor.getPercentual();
        return this.calcPrecoVenda(perc);
    }
}