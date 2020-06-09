package main.javacore.Csobrecargametodos.teste;

import main.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTeste {

    public static void main(String[] args) {

        Funcionario func = new Funcionario("José", "359.774.364-82", 1000.00, "487613");
        Funcionario func2 = new Funcionario();
      
        func.imprime();
        func2.imprime();

    }
}