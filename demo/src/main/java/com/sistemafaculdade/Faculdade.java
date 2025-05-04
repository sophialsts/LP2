package com.sistemafaculdade;
import java.util.ArrayList;

public class Faculdade {

    private String nome;
    private ArrayList<Curso> cursos;
    private ArrayList<Aluno> alunosFaculdade;
    private int anoCriacao;

    public Faculdade(String nome, int anoCriacao) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.cursos = new ArrayList<Curso>();
        this.alunosFaculdade = new ArrayList<Aluno>();
    }

    public Curso getCursos(String nomeCurso) {
    	for (Curso i:cursos) {
            if(i.getNome().equals(nomeCurso)){
                return i;
            }
	}
	return null;
    }

    public Aluno getAlunos(String nomeAluno) {
        for (Aluno i:alunosFaculdade) {
            if(i.getNome().equals(nomeAluno)){
                return i;
            }
        }
        return null;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }


    public void addCurso(Curso novoCurso) {

        for(Curso iterator:cursos) {
            if(iterator.getNome().equals(novoCurso.getNome())) {
                return;
            }
        }
        this.cursos.add(novoCurso);
    }

    public void removeCurso(Curso cursoADeletar) {

        for(Curso iterator:cursos) {
            if(iterator.getNome().equals(cursoADeletar.getNome())) {
                cursos.remove(cursoADeletar);
                return;
            }
        }

        System.out.println("Esse curso não está na lista de cursos faculdade.");

    }

    public void addAluno(Aluno novoAluno) {

        for(Aluno iterator:alunosFaculdade) {
            if(iterator.getNome().equals(novoAluno.getNome())) {
                return;
            }
        }
        this.alunosFaculdade.add(novoAluno);
    }

    public Faculdade novaFaculdade(String nomeNovo, int anoNovo){
        Faculdade novaFaculdade = new Faculdade(nomeNovo, anoNovo);

        for(Curso i:cursos) {
            if(anoNovo <= i.getAnoCriacaoC()+5) {
                novaFaculdade.addCurso(i);
            }
        }

        return novaFaculdade;
    }

    //criar uma função calc alunos total

}
