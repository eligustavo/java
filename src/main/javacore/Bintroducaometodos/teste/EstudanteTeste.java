package main.javacore.Bintroducaometodos.teste;

import main.javacore.Bintroducaometodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {

        Estudante est = new Estudante();
        est.setNome("nome"); 
        est.setIdade(12);
        est.setNotas(new double[] {8, 7, 6});

        est.imprimeAluno();
        est.media();
        System.out.println("Aprovado? " +est.isAprovado());
    }
} 