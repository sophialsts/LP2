package com.sistemabiblioteca;

public class Livro {

    String titulo, autor;
    int numeroPgs, anoEdicao;
    boolean estaEmprestado;

    public Livro(String titulo, String autor, int numeroPgs, int anoEdicao, boolean estaEmprestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPgs = numeroPgs;
        this.anoEdicao = anoEdicao;
        this.estaEmprestado = estaEmprestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPgs() {
        return numeroPgs;
    }

    public void setNumeroPgs(int numeroPgs) {
        this.numeroPgs = numeroPgs;
    }

    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    public boolean isEstaEmprestado() {
        return estaEmprestado;
    }

    public void setEstaEmprestado(boolean estaEmprestado) {
        this.estaEmprestado = estaEmprestado;
    }

    @Override
    public String toString() {
        return "Livro{" +
            "titulo='" + titulo + '\'' +
            ", autor='" + autor + '\'' +
            ", numeroPgs=" + numeroPgs +
            ", anoEdicao=" + anoEdicao +
            ", estaEmprestado=" + estaEmprestado +
            '}';
    }

}
