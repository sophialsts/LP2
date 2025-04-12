package blueJ;
 
public class Fabricante {
    private long cnpj;
    String nomeFantasia, endereco;
    private float percentual;
    public Fabricante(long cnpj, String nomeFantasia, String endereco, float percentual) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.endereco = endereco;
        this.percentual = percentual;
    }
    public void setPercentual(float percentual){
        this.percentual = percentual;
    }
    public float getPercentual() {
        return this.percentual;
    }
}