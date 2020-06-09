package main.javacore.Eblocosdeinicializacao.teste;

import main.javacore.Eblocosdeinicializacao.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cli = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        for (int parcela : cli.getParcelas()) {
            System.out.print(parcela + " ");
        }
    }
}