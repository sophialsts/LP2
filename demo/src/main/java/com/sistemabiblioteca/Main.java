package com.sistemabiblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Sophi's library");
        Livro livro1 = new Livro("Estrutura de Dados","Fulaninho", 590, 2010, false);
        Movimentacao doLivro1 = new Movimentacao("Estrutura de Dados","Fulaninho", 590, 2010, false);
        doLivro1.emprestimo(5);
        doLivro1.devolucao(12);

    }
}
