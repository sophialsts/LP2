package com.sistemaapple;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Aplicativo appleTV = new Aplicativo("Apple TV", "Entretenimento", 1024, 29.99f);
        Aplicativo safari = new Aplicativo("Safari", "Busca", 760, 0f);
        Aplicativo appleStore = new Aplicativo("Apple Store", "Loja de Aplicativos", 960, 0f);
        Aplicativo appleMusic = new Aplicativo("Apple Music", "Música", 560, 0f);
        Aplicativo appleFitness = new Aplicativo("Apple Fitness", "Saúde", 360, 0f);
        Usuario primeiro = new Usuario("first", "123456", "02/05/2025");
        Usuario segundo = new Usuario("second", "123456", "02/05/2025");
        Apple lojaApple = new Apple("Apple", primeiro, appleTV);

        lojaApple.addUsuario(primeiro);
        lojaApple.addUsuario(segundo);

        lojaApple.addApp(appleTV);
        lojaApple.addApp(appleFitness);
        lojaApple.addApp(appleStore);
        lojaApple.addApp(safari);
        lojaApple.addApp(appleMusic);

        primeiro.addApp(appleTV);
        appleTV.addUser(primeiro);

        primeiro.addApp(appleFitness);
        appleFitness.addUser(primeiro);

        primeiro.addApp(appleStore);
        appleStore.addUser(primeiro);
        appleStore.addUser(segundo);

        segundo.addApp(safari);
        safari.addUser(segundo);

        segundo.addApp(appleMusic);
        appleMusic.addUser(segundo);

        System.out.println(lojaApple.maisUsuarios());
        System.out.println(lojaApple.maisUsuarios());


        /*
            System.out.println("Digite a opção que você quer:");
            System.out.println("1 - Adicionar novo usuário a lista de usuários");
            System.out.println("2 - Adicionar novo aplicativo a lista de aplicativos:");
            System.out.println("3 - Adicionar novo aplicativo a um usuário específico:");
            System.out.println("4 - Adicionar um novo usuário a um aplicativo");
            System.out.println("5 - Ver qual aplicativo tem mais usuários");
            System.out.println("6 - Ver se é possível reduzir valor com aplicativo semelhante");
            System.out.println("7 - Ver lista de usuários de um aplicativo");
            System.out.println("8 - Ver lista de apps de um usuário");
            System.out.println("9 - Sair"); */

    }
}
