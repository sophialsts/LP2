package com.sistemafaculdade;
import java.util.ArrayList;

public class Faculdade {

    private String nome;
    private ArrayList<Curso> cursos;
    private int anoCriacao;

    public Curso getCursos(Curso cursoEspecif) {
        for (Curso i:cursos) {
            if(i == cursoEspecif){
                return cursoEspecif;
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

    public Faculdade(String nome, int anoCriacao) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.cursos = new ArrayList<Curso>();
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

    public Faculdade novaFaculdade(String nomeNovo, int anoNovo){
        Faculdade novaFaculdade = new Faculdade(nomeNovo, anoNovo);

        for(Curso i:cursos) {
            if(anoNovo <= i.getAnoCriacaoC()+5) {
                novaFaculdade.addCurso(i);
            }
        }

        return novaFaculdade;
    }

}
