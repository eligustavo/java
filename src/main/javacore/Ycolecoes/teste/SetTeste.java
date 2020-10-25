package main.javacore.Ycolecoes.teste;

import main.javacore.Ycolecoes.classes.Produto;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("123", "Laptop", 2000.0, 0);
        Produto p2 = new Produto("321", "Teclado", 1000.0, 10);
        Produto p3 = new Produto("679", "Picanha", 26.4, 5);
        Produto p4 = new Produto("293", "Celular Samsung", 3250.5, 0);
        Set<Produto> produtoSet = new LinkedHashSet<>();
        produtoSet.add(p1);
        produtoSet.add(p2);
        produtoSet.add(p3);
        produtoSet.add(p4);
        for (Produto p : produtoSet) {
            System.out.println(p);
        }

    }
}
