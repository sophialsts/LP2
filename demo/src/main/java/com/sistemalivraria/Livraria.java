package com.sistemalivraria;
class Livraria {
    private String nome, autor;
    private int edicao, ano;
    private float preco;
    
    public void setNewPrice (float p) {
        this.preco = p;
    }
    
    public Livraria (String nom, String aut, float pre, int edi, int ano) {
        this.nome = nom;
        this.autor = aut;
        this.preco = pre;
        this.edicao = edi;
        this.ano = ano;
    }
    
    public float calculaPreco (float percent) {
        float precoLivro;
        precoLivro = preco + ((percent/100) * preco);
        return precoLivro;
    }
    
    public void imprimeDados (){
        System.out.println("Nome do livro é: "+ this.nome);
        System.out.println("Nome do autor é: "+ this.autor);
        System.out.println("O preço é: "+ this.preco);
        System.out.println("A ediçao é a "+ this.edicao);
        System.out.println("E foi publicado no ano de: "+ this.ano);
    }
    
    public static void main(String[] args) {
        Livraria novoLivro = new Livraria("Java para Iniciantes", "Herbert Schildt", 70f, 6, 2015 );
        float precoDoLivro = novoLivro.calculaPreco(20);
        novoLivro.setNewPrice(precoDoLivro);
        novoLivro.imprimeDados();
    }
}

