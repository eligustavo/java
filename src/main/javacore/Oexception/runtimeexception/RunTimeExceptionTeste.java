package main.javacore.Oexception.runtimeexception;

public class RunTimeExceptionTeste {
    public static void main(String[] args) {
        try {
            divisao(10, 0);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void divisao(int n1, int n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Passe um valor diferente de ZERO para n2");
        }
        int rs = (n1 / n2);
        System.out.println(rs);
    }

}