package blueJ;

public class AlunoEx1 {

    int matricula, anoIngresso, disciplinas;
    String situacao, nome, curso;
    
    public AlunoEx1(int matricula, String nome, int ano, String meuCurso) {
        this.matricula = matricula;
        this.nome = nome;
        this.anoIngresso = ano;
        this.curso = meuCurso;
    }

    int permanencia (int anoAtual) {
        int tempo;
        tempo = anoAtual - anoIngresso;
        return tempo;
    }
    
    void informarDesc (int cadeiras) {
        this.disciplinas = cadeiras;
        System.out.println("sua mensalidade sera: " + this.calculoMensalidade());
    }
    
    int calculoMensalidade() {
        return this.disciplinas*200;
    }
    
    void informarSit (String sit) {
        this.situacao = sit;
        System.out.println("A sua situaçao e:" + this.situacao);
    }
}

