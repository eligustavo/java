package main.javacore.Bintroducaometodos.teste;

import main.javacore.Bintroducaometodos.classes.Calculadora;

public class ParametrosTeste {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        int n1 = 5;
        int n2 = 10;

        calc.alteraDoisNumeros(n1, n2);
        System.out.println("Dentro do teste");
        System.out.println("n1: " + n1);
        System.out.println("n1: " + n2);

    }
}