package main.javacore.Lclassesabstratas.teste;


import main.javacore.Lclassesabstratas.classes.Gerente;
import main.javacore.Lclassesabstratas.classes.Vendedor;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Vendedor v = new Vendedor("camila", "1265798-5", 1500, 5000);
        Gerente g = new Gerente("Ana", "127742-2", 2000);
        v.calculaSalario();
        g.calculaSalario();
        System.out.println(v);
        System.out.println(g);

    }

}