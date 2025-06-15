package com.sistemabiblioteca;
import java.util.ArrayList;

public class Biblioteca {

    ArrayList<Livro> livros;
    public Biblioteca() {
        this.livros = new ArrayList<Livro>();
    }

    public void addLivro(Livro novoLivro) {
        this.livros.add(novoLivro);
    }

}
