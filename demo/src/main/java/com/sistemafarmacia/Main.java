package com.sistemafarmacia;

public class Main {
    public static void main (String[] args) {
            Fabricante produtor = new Fabricante(10293, "fabricante1", "ruaAleatoria", 30.0f);
            Medicamento farmaco = new Medicamento("nimesulida", "nimesulida", 11.99f, produtor);
            
            System.out.println(farmaco.calcPrecoVenda(30.0f));
        }
}