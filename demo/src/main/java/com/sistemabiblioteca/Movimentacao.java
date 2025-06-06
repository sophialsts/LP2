package com.sistemabiblioteca;

public class Movimentacao extends Livro implements ItemDeBiblioteca{

    int diaEmprestimo, diaDevolucao;

    public Movimentacao(String titulo, String autor, int numeroPgs, int anoEdicao, boolean estaEmprestado) {
        super(titulo, autor, numeroPgs, anoEdicao, estaEmprestado);
    }

    public void emprestimo(int dia) {
        this.diaEmprestimo = dia;
        setEstaEmprestado(true);

        if(dia + 14 <= 30) {
            diaDevolucao = dia + 14;
        }
        else {
            diaDevolucao = dia + 14 - 30;
        }

    };

    public void devolucao(int dia) {
        if(diaDevolucao > diaEmprestimo) {
            if(dia <= diaEmprestimo + 14) System.out.println("Entregue dentro do prazo");
            else System.out.println("Fora do prazo");
        }
        else {
            if(diaEmprestimo + 14 - 30 >= dia) {
                System.out.println("Entregue dentro do prazo");
            }
            else System.out.println("Fora do prazo");
        }

        setEstaEmprestado(false);
    };

}
