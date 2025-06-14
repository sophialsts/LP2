package com.sistemaadmcartoes;
import java.util.ArrayList;

public class Administradora {

    String bandeira;
    ArrayList<Cliente> clientes;

    public void addCliente(Cliente novoCliente) {
        this.clientes.add(novoCliente);
    }

    public Administradora(String bandeira) {
        this.bandeira = bandeira;
        this.clientes = new ArrayList<Cliente>();
    }

}
