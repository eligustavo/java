package main.javacore.Minterfaces.teste;

import main.javacore.Minterfaces.classes.Produto;

public class TesteProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4, 3000);
        p.calculaImposto();
        p.calculaFrete();
        System.out.println(p);
    }
}