package main.javacore.Bintroducaometodos.classes;

public class Calculadora {

    public void soma()
    {
        System.out.println(5 + 5);
    }

    public void subtrai() {
        System.out.println(5 - 5);
    }

    public void multiplica(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            return 0;
        }
    }

    public void imprimeDoisNumeros(double n1, double n2) {
        System.out.println(n1 / n2);
        if (n2 != 0) {
            System.out.println(n1 / n2);
            return;
        }
        System.out.println("Não é possivel a divisão");
    }

    public void alteraDoisNumeros(int n1, int n2) {
        n1 = 30;
        n2 = 40;

        System.out.println("Dentro do altera dois numeros");
        System.out.println("n1: " + n1);
        System.out.println("n1: " + n2);

    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
       System.out.println("Dentro do VarArgs");
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}