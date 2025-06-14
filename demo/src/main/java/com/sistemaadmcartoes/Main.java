package com.sistemaadmcartoes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Administradora geral = new Administradora("Visa");
        CartaoUniversitario primeiroCard = new CartaoUniversitario(1, 2, "10/25", "10/29", "Uneb");
        Cliente primeiro = new Cliente("11111111111", "Julia", "99999-9999", primeiroCard);
        primeiro.efetuarCompra(primeiroCard, "Riachuelo", "29/10/25", 100f, 2);
        primeiro.efetuarCompra(primeiroCard, "Riachuelo", "30/10/25", 200f, 2);
        System.out.println(primeiroCard.getPontos());

    }
}
