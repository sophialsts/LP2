package com.sistemabiblioteca;

public class Movimentacao extends Livro implements ItemDeBiblioteca{

    Livro movLivro;

    public Movimentacao(String titulo, String autor, int numeroPgs, int anoEdicao, boolean estaEmprestado, Livro livroEsp) {
        super(titulo, autor, numeroPgs, anoEdicao, estaEmprestado);
        this.movLivro = livroEsp;
    }

    public void emprestimo() {
        if(this.estaEmprestado) {
            System.out.println("O livro já está emprestado.");
        }
        else {
            System.out.println("Livro emprestado");
            this.setEstaEmprestado(true);
        }
    }

    public void devolucao(int diasPassados) {
        if(!estaEmprestado) System.out.println("O livro não está emprestado para ser devolvido");
        else {
            if(diasPassados > 14) {
                System.out.println("O livro passou do prazo de empréstimo.");
                this.setEstaEmprestado(false);
            }
            else {
                System.out.println("Livro entregue dentro do prazo");
                this.setEstaEmprestado(false);
            }
        }
    }

}
