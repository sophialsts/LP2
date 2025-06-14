package com.sistemaseguradora;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        SegResidencial s1;
        s1 = new SegResidencial("Sophia", 20000f, "rua 1", 2015 );
        SegAutomovel s2;
        s2 = new SegAutomovel("Letícia", 15000f, "DAS9214J", 2019);
        SegVida s3;
        s3 = new SegVida("Eli", 25000f, 45);

        s1.imprimir();
        s2.imprimir();
        s3.imprimir();

    }
}
