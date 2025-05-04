package com.sistemafaculdade;
import java.util.ArrayList;

public class Aluno {

    private int matricula, anoIngresso, quantDisciplinas;
    private String situacao, nome, curso;
    private ArrayList<String> listaDisciplinas;

    public Aluno(int matricula, String nome, int ano, String meuCurso) {
        this.matricula = matricula;
        this.nome = nome;
        this.anoIngresso = ano;
        this.curso = meuCurso;
        this.quantDisciplinas = 0;
        this.listaDisciplinas = new ArrayList<String>();
    }

    public int getMatricula() {
	    return this.matricula;
    }

    public int getAnoIngresso() {
	    return this.anoIngresso;
    }

    public int getQuantDisciplinas() {
	    return this.quantDisciplinas;
    }

    public String getSituacao() {
	    return this.situacao;
    }

    public String getNome() {
	    return this.nome;
    }

    public String getCurso() {
	    return this.curso;
    }

    public String getDisciplina(String disciplina) {
    	for(String i:listaDisciplinas){
		if(i.equals(disciplina)) {
			return i;
		}
	}
	return "não tem";
    }

    int permanencia (int anoAtual) {
        int tempo;
        tempo = anoAtual - this.anoIngresso;
        return tempo;
    }

    void informarDesc (int cadeiras) {
        this.quantDisciplinas = cadeiras;
        System.out.println("sua mensalidade sera: " + this.calculoMensalidade());
    }

    int calculoMensalidade() {
        return this.quantDisciplinas*200;
    }

    void informarSit (String sit) {
        this.situacao = sit;
        System.out.println("A sua situaçao e:" + this.situacao);
    }
}
