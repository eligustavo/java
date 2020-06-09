package main.javacore.Bintroducaometodos.teste;

import main.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTeste {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.soma();
        calc.subtrai();
        calc.multiplica(5, 5);
        double result = calc.divide(100, 10);
        System.out.println(result);
        calc.imprimeDoisNumeros(20, 0);
        System.out.println("continuando a exec");

        int[] numeros = { 1, 2, 3, 4, 5 };
        calc.somaArray(numeros);
        calc.somaVarArgs(1, 2, 3, 4, 5);
    }
}