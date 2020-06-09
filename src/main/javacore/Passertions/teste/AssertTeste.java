package main.javacore.Passertions.teste;

public class AssertTeste {

    public static void main(String[] args) {
        calculaSalario(-2000);
    }

    private static void calculaSalario(double salario) {
        assert (salario > 0);
        // fazer calculo com salario
    }

    public static void calcSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException();
        }
    }
}
