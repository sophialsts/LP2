package blueJ;

public class Livraria
{
    String nome, autor;
    int edicao, ano;
    float preco;
    
    Livraria (String nom, String aut, float pre, int edi, int ano) {
        this.nome = nom;
        this.autor = autor;
        this.preco = pre;
        this.edicao = edi;
        this.ano = ano;
    }
    
    void calculaPreco (int percent) {
        float precoLivro;
        precoLivro = preco + ((percent/100) * preco);
        System.out.println("O preço do livro e: "+ precoLivro);
    }
    
    void imprimeDados (){
        System.out.println("Nome do livro e "+ this.nome + "\n");
        System.out.println("Nome do autor e "+ this.autor + "\n");
        System.out.println("O preço e "+ this.preco + "\n");
        System.out.println("A ediçao e de "+ this.edicao + "\n");
        System.out.println("E foi publicado no ano de: "+ this.ano + "\n");
    }

}
