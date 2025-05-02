package com.sistemaapple;
import java.util.ArrayList;

public class Usuario {

    private String login, senha, dataAtivacao;
    private ArrayList<Aplicativo> meusApps;

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getDataAtivacao() {
        return dataAtivacao;
    }

    public ArrayList<Aplicativo> getMeusApps() {
        return meusApps;
    }

    public Usuario(String login, String senha, String dataAtivacao) {
        this.login = login;
        this.senha = senha;
        this.dataAtivacao = dataAtivacao;
        this.meusApps = new ArrayList<Aplicativo>();
    }

    public float gastoEmApps(Usuario user) {
        float gastoTotal = 0;

        for(Aplicativo meuApp:meusApps) {
            gastoTotal += meuApp.getPreco();
        }
        return gastoTotal;
    }

    public void addApp(Aplicativo novoApp) {
        this.meusApps.add(novoApp);
    }

}
