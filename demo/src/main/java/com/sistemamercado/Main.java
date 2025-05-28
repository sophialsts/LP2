package com.sistemamercado;

public class Main {
    public static void main(String[] args) {
        Produto primeiro = new Produto(7, "Milho de pipoca", 4.99f);
        System.out.println(primeiro.precoVenda());

    }
}
