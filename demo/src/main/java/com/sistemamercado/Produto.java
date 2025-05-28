package com.sistemamercado;

public class Produto {

    protected int codigo;
    protected String nome;
    protected float precoCusto;

    Produto(int c, String n, float pc) {
        this.codigo = c;
        this.nome = n;
        this.precoCusto = pc;
    }

    public float precoVenda() {
        return this.precoCusto*1.3f;
    }

}
