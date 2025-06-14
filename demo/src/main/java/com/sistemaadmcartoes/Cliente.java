package com.sistemaadmcartoes;

public class Cliente {

    String cpf, nome, telefone;
    Cartao meuCartao;

    public Cliente(String cpf, String nome, String telefone, Cartao meuCartao) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.meuCartao = meuCartao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cartao getMeuCartao() {
        return meuCartao;
    }

    public void setMeuCartao(Cartao meuCartao) {
        this.meuCartao = meuCartao;
    }

    public void efetuarCompra(CartaoUniversitario card, String nomeEstabelecimento, String dataCompra, float valorCompra, int parcelas) {
        if(card.getLimite() <= 300){
            Compra novaCompra = new Compra(nomeEstabelecimento, dataCompra, valorCompra, parcelas,card);
            float limiteAtual = card.getLimite();
            card.setLimite(limiteAtual += valorCompra/parcelas);
            System.out.println("Compra efetuada");
            System.out.println("Quantidade de pontos que a compra gerou:" + card.calcPontosCompra(valorCompra));
            int pontos = card.getPontos();
            card.setPontos(pontos += card.calcPontosCompra(valorCompra));
        }
        else System.out.println("Não foi possível realizar a compra, estourou o limite.");
    }

    public void efetuarCompra(CartaoOuro card, String nomeEstabelecimento, String dataCompra, float valorCompra, int parcelas) {
        if(card.getLimite() <= 1000000){
            Compra novaCompra = new Compra(nomeEstabelecimento, dataCompra, valorCompra, parcelas,card);
            float limiteAtual = card.getLimite();
            card.setLimite(limiteAtual += valorCompra/parcelas);
            System.out.println("Compra efetuada");
            System.out.println("Quantidade de pontos que a compra gerou:" + card.calcPontosCompra(valorCompra));
            int pontos = card.getPontos();
            card.setPontos(pontos += card.calcPontosCompra(valorCompra));
        }
        else System.out.println("Não foi possível realizar a compra, estourou o limite.");
    }
}
