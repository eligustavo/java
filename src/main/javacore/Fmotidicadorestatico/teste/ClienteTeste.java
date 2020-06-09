package main.javacore.Fmotidicadorestatico.teste;

import main.javacore.Fmotidicadorestatico.classes.Cliente;

public class ClienteTeste {
    public static void main(String[] args) {

        Cliente cli = new Cliente();
        Cliente cli2 = new Cliente();
        System.out.println("Exibindo quantidade de parcelas possiveis");
        // for (int parcela : cli.getParcelas()) {
        // System.out.print(parcela + " ");
        // }
        System.out.println("Tamanho: " + Cliente.getParcelas().length);
        System.out.println("Tamanho: " + Cliente.getParcelas().length);
        System.out.println("Tamanho: " + Cliente.getParcelas().length);
    }
}