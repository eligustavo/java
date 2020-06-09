package main.javacore.Oexception.checkedexception.teste;

import main.javacore.Oexception.customexception.LoginInvalidoException;

public class CustomExceptionTeste {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    private static void logar() throws LoginInvalidoException {
        String usuarioBancoDeDados = "adm";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "adm";
        String senhaDigitada = "121";
        if (!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)) {
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logado");
        }
    }
}