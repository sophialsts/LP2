package com.sistemashopping;

public class Shopping {

    private String nome;
    private Loja[] lojas = null;

    public String lojaMaiorFaturamento() {

        int i = 1;
        int cont = 0;
        float maiorFaturamento = 0;

        if(this.loja[0] == null) return;
        maiorFaturamento = this.lojas[0].getFaturamento();

        while(this.lojas[i] != null ) {
            if(maiorFaturamento < this.lojas[i].getFaturamento()) maiorFaturamento = this.lojas[i].getFaturamento();
            cont = i;
            i++;
        }

        return this.lojas[cont].getNomeFantasia();

    }

}
