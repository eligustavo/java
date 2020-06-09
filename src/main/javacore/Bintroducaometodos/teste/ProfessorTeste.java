package main.javacore.Bintroducaometodos.teste;

import main.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTeste {

    public static void main(String[] args) {

        Professor prof = new Professor();
        prof.cpf = "122.333.336.99";
        prof.nome = "joão";
        prof.matricula = 13245;
        prof.rg = "12354987";

        Professor prof2 = new Professor();
        prof2.cpf = "188.633.336.99";
        prof2.nome = "josé";
        prof2.matricula = 13587;
        prof2.rg = "4598725";

        prof.imprime();
        prof2.imprime();
    }
}