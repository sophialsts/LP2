package com.sistemafaculdade;

public class Main {
    public static void main(String[] args) {

          Faculdade minhaFaculdade = new Faculdade("Unifacs", 1990)  ;
          Curso primeiroCurso = new Curso("Sistemas de Informação", 7, 9, 120000f, 2004);
          Curso segundoCurso = new Curso("Medicina", 9, 12, 1000000f, 2002);

          System.out.println(primeiroCurso.calcMensalidade());
          minhaFaculdade.addCurso(primeiroCurso);
          minhaFaculdade.addCurso(segundoCurso);
          System.out.println(minhaFaculdade.getCursos(primeiroCurso).getNome()); //só pra testar se getCursos funciona

          /*minhaFaculdade.removeCurso(primeiroCurso);
          System.out.println(minhaFaculdade.getCursos(primeiroCurso).getNome()); deu nullpointerexception ent apagou mesmo*/

          System.out.println(minhaFaculdade.novaFaculdade("Unijorge", 2008).getCursos(segundoCurso).getNome()); //o curso de medicina não deve entrar

    }
}
