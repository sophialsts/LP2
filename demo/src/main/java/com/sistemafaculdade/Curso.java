package com.sistemafaculdade;
import java.util.ArrayList;

public class Curso {

    private String nome;
    private int codigo, duracao, anoCriacaoC;
    private float valorTotal;
    private ArrayList<Aluno> alunosDoCurso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriacaoC() {
        return anoCriacaoC;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacaoC = anoCriacao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }


    public Curso(String n, int c, int d, float vt, int ac) {
        this.nome = n;
        this.codigo = c;
        this.duracao = d;
        this.valorTotal = vt;
        this.anoCriacaoC = ac;
        this.alunosDoCurso = new ArrayList<Aluno>();
    }

    public Curso(String n, int c,float vt, int ac) {
        this(n,c,8,vt,ac);
    }

    public float calcMensalidade() {
        float mensalidade = (this.valorTotal / this.duracao)/6; //divide por 6 porque duração tá em semestre e quer mensal
        return mensalidade;
    }
}
