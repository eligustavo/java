package main.javacore.Oexception.checkedexception.teste;

import java.io.IOException;

import main.javacore.Oexception.checkedexception.classe.Funcionario;
import main.javacore.Oexception.checkedexception.classe.Pessoa;
import main.javacore.Oexception.customexception.LoginInvalidoException;

public class SobrescritaComExceptionsTeste {
    public static void main(String[] args) throws LoginInvalidoException, IOException {
        Funcionario f = new Funcionario();
        Pessoa p = new Pessoa();

        p.salvar();
    }

}