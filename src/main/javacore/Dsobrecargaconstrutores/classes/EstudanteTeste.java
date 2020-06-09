package main.javacore.Dsobrecargaconstrutores.classes;

import main.javacore.Dsobrecargaconstrutores.testes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {

        Estudante estudante = new Estudante("12222", "josé", new double[] {10, 10, 10}, "12/05/2020");
        estudante.imprime();
    }
}