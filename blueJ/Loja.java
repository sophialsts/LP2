package blueJ;
 
public class Loja {
    private String nomeFantasia, razaoSocial, publicoAlvo;
    private long cnpj;
    private int digCnpj;
    private float area, faturamento;
 
    public Loja(String n, long cnpj, int d, int f, String pa ) {
        this(n,n,cnpj,d);
        this.faturamento = f;
        this.publicoAlvo = pa;
    }
    public Loja(String n, String rs, long cnpj, int d) {
        this.nomeFantasia = n;
        this.razaoSocial = rs;
        this.cnpj = cnpj;
        this.digCnpj = d;
    }
    //fazer gets e sets
    public void verificaFaturamento () {
        
    }
    public float calcAluguel (float a) {
        this.faturamento = 50*a;
        return this.faturamento;
    }
}