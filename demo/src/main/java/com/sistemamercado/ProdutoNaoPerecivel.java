package com.sistemamercado;

public class ProdutoNaoPerecivel extends Produto {

    protected boolean validade;
    protected String formaArmazenamento;

    ProdutoNaoPerecivel(int c, String n,float pc, boolean v, String fa) {
        super(c,n,pc);
        this.validade = v;
        this.formaArmazenamento = fa;
    }

}
