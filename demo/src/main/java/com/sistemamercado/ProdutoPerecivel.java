package com.sistemamercado;

public class ProdutoPerecivel extends Produto {

    protected String substancia;

    ProdutoPerecivel(int c, String n, float pc,String substancia) {
        super(c,n,pc);
        this.substancia = substancia;
    }
}
