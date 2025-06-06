package com.sistemabiblioteca;
import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    private String nome;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<Livro>();
    }

    public void addLivros(Livro livro) {
        this.livros.add(livro);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
