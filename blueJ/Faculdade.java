package blueJ;

public class Faculdade {
    
    private String nome;
    private int codigo, duracao, valorTotal, anoCriacao;
    
    //fzr gets e sets
    
    public Faculdade(String n, int c, int d, int vt, int ac) {
        this.nome = n;
        this.codigo = c;
        this.duracao = d;
        this.valorTotal = vt;
        this.anoCriacao = ac;
    }
    
    public Faculdade(String n, int c,int vt, int ac) {
        this(n,c,8,vt,ac);
    }
    
    public int calcMensalidade() {
        int mensalidade = this.valorTotal / this.duracao;
        return mensalidade;
    }
}
