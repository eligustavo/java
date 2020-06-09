package main.javacore.Gassociacao.teste;

import main.javacore.Gassociacao.classes.exercicio.classes.Aluno;
import main.javacore.Gassociacao.classes.exercicio.classes.Local;
import main.javacore.Gassociacao.classes.exercicio.classes.Professor;
import main.javacore.Gassociacao.classes.exercicio.classes.Seminario;

public class AssociacaoTeste {

    public static void main(String[] args) {

        Aluno aluno = new Aluno("Naruto", 15);
        Aluno aluno2 = new Aluno("Sasuke", 15);
        Seminario seminario = new Seminario("Como ser um programador!!!");
        Professor prof = new Professor("Kakashi", "Usar o sharingan para copiar códigos");
        Local local = new Local("Konoha", "País do fogo");

        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario.setProfessor(prof);
        seminario.setLocal(local);
        seminario.setAlunos(new Aluno[] { aluno, aluno2 });

        Seminario[] semArray = new Seminario[1];
        semArray[0] = seminario;
        prof.setSeminarios(semArray);

        seminario.print();
        prof.print();

    }
}