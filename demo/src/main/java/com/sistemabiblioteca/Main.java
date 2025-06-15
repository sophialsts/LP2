package com.sistemabiblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca minhaBiblioteca = new Biblioteca();
        Livro novoLivro = new Livro("sla", "sla2", 390, 2019, false);
        minhaBiblioteca.addLivro(novoLivro);
        System.out.print(novoLivro.toString());
        Movimentacao movLivro1 = new Movimentacao("sla", "sla2", 390, 2019, false, novoLivro);
        movLivro1.emprestimo();
        movLivro1.devolucao(15);

    }
}
