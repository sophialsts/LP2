package com.sistemaseguradora;

public class Main {
    public static void main(String[] args){

        SegResidencial s1;
        s1 = new SegResidencial("Sophia", 20000f, "rua 1", 2015 );

        s1.imprimir();
        System.out.println(s1.calcValor());

    }
}
