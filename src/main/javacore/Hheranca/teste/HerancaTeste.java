package main.javacore.Hheranca.teste;

import main.javacore.Hheranca.classes.Endereco;
import main.javacore.Hheranca.classes.Funcionario;
import main.javacore.Hheranca.classes.Pessoa;

public class HerancaTeste {

    public static void main(String[] args) {
        Pessoa p = new Pessoa("Teste");
        Endereco e = new Endereco();

        p.setNome("joão");
        p.setCpf("1232465");
        e.setBairro("bairro 1");
        e.setRua("rua 1");

        p.setEndereco(e);

        p.print();
        System.out.println("======================================");
        Funcionario f = new Funcionario("antonio");

        f.setNome("pedro");
        f.setCpf("1235487988");
        f.setSalario(15000.00);
        f.setEndereco(e);

        f.print();

    }
}