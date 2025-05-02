package com.sistemaapple;
import java.util.ArrayList;

public class Aplicativo {

    private String nome, objetivo;
    private int tamanho;
    private float preco;
    private ArrayList<Usuario> listaUsers;

    public Aplicativo(String nome, String objetivo, int tamanho, float preco) {
        this.nome = nome;
        this.objetivo = objetivo;
        this.tamanho = tamanho;
        this.preco = preco;
        this.listaUsers = new ArrayList<Usuario>();
    }

    public Aplicativo(String nome, String objetivo, int tamanho) {
        this(nome,objetivo,tamanho,0);
    }

    public String getNome() {
        return nome;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public float getPreco() {
        return preco;
    }
    public ArrayList<Usuario> getListaUsers() {
        return listaUsers;
    }

    public boolean troca(Aplicativo appComparado){
        return(this.objetivo.equals(appComparado.getObjetivo()) && appComparado.getPreco()<=this.preco);
    }

    public void addUser(Usuario userApp) {
        this.listaUsers.add(userApp);
    }
}
