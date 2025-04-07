package blueJ;

public class Medicamento
{
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
    
    public String getPrincipio() {
        return this.principioAtv;
    }
    
    public float getPrecoC() {
        return this.precoCusto;
    }
    
    //se o nome do principio ativo e o nome forem iguais
    public Medicamento(String nome, float precoCusto){
        this(nome, nome, precoCusto);
    }
    
    public Medicamento(String nome, String principio, float precoC ){
        this.nome = nome;
        this.precoCusto = precoC;
        this.principioAtv = principio;
    }
    
    public float calcPrecoVenda(float percentual) {
        return this.precoCusto + this.precoCusto*percentual/100;
    }
    
    public float calcPrecoVenda() {
        return this.calcPrecoVenda(30);
    }
}
