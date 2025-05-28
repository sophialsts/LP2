package com.sistemapedagio;
import java.util.ArrayList;

public class Contrato {

    private String cpf, nome, endereco, email, telefone;
    private ArrayList<Automovel> meusAutomoveis;

    public Contrato(String telefone, String email, String endereco, String nome, String cpf) {
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.cpf = cpf;
    }

    public void addAuto(Automovel auto) {
        this.meusAutomoveis.add(auto);
    }
    
    public float fatura() {
        float total = 0;

        for(Automovel auto : meusAutomoveis) {
            total = auto.cobraPassagem()*auto.qtdPassagens();
        }
        return total;
    }
}
