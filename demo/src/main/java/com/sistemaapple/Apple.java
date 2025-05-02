package com.sistemaapple;
import java.util.ArrayList;

public class Apple {

    private String nome;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Aplicativo> apps;

    public String getNome() {
        return nome;
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Aplicativo> getApps() {
        return apps;
    }

    public Apple(String nome, Usuario user, Aplicativo app) {
        this.nome = nome;
        this.usuarios = new ArrayList<Usuario>();
        this.apps = new ArrayList<Aplicativo>();
    }

    public boolean reduzConta(Usuario user) {
        for(Aplicativo meuApp:user.getMeusApps()) {
            for(Aplicativo appEmpresa:apps) {
                if(!meuApp.getNome().equals(appEmpresa.getNome()) && meuApp.troca(appEmpresa)) {
                    return true;
                }
            }
        }
        return false;
    }


    public String maisUsuarios() {
        String nome = null;
        int maior = 0;

        for(Aplicativo appEmp:this.apps) {
            if(maior < appEmp.getListaUsers().size()) {
                maior = appEmp.getListaUsers().size();
                nome = appEmp.getNome();
            }
        }

        return nome;
    }

    public void addUsuario(Usuario user) {
        this.usuarios.add(user);
    }

    public void addApp(Aplicativo app) {
        this.apps.add(app);
    }

};
