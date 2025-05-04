package com.sistemafaculdade;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
	  Scanner ler = new Scanner(System.in);
	  String nome;
	  int codigo, semestres, ano;
	  float valorCurso;

          Faculdade minhaFaculdade = new Faculdade("Unifacs", 1990);

	  /*Curso primeiroCurso = new Curso("Sistemas de Informação", 7, 9, 120000f, 2004);
          Curso segundoCurso = new Curso("Medicina", 9, 12, 1000000f, 2002);*/

	  /*for(int i=0; i<2;i++) {
		System.out.println("Digite nome do curso:");
		nome = ler.next();
		System.out.println("Digite o código do curso:");
		codigo = ler.nextInt();
		System.out.println("Digite a quantidade de semestres do curso:");
		semestres = ler.nextInt();
		System.out.println("Digite o ano de criação do curso:");
		ano = ler.nextInt();
		System.out.println("Digite o valor total do curso:");
		valorCurso = ler.nextFloat();
		Curso curso = new Curso(nome,codigo,semestres,valorCurso,ano);
   	  	minhaFaculdade.addCurso(curso);
	  }*/



          System.out.println(minhaFaculdade.getAlunos("Sophia").getMatricula());
          //System.out.println(minhaFaculdade.getCursos("SistemasdeInformação").calcMensalidade());
            //System.out.println(minhaFaculdade.getCursos("Medicina").calcMensalidade());
          //minhaFaculdade.addCurso(primeiroCurso);
          //minhaFaculdade.addCurso(segundoCurso);
          //System.out.println(minhaFaculdade.getCursos(primeiroCurso).getNome()); //só pra testar se getCursos funciona

          /*minhaFaculdade.removeCurso(primeiroCurso);
          System.out.println(minhaFaculdade.getCursos(primeiroCurso).getNome()); deu nullpointerexception ent apagou mesmo*/

          //System.out.println(minhaFaculdade.novaFaculdade("Unijorge", 2008).getCursos(segundoCurso).getNome()); o curso de medicina não deve entrar

    }
}
