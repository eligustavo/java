package main.javacore.Ycolecoes.teste;

import main.javacore.Ycolecoes.classes.Celular;
import main.javacore.Ycolecoes.classes.Produto;

import java.util.*;


public class TreeSetTeste {
    public static void main(String[] args) {
        Produto p1 = new Produto("123", "Laptop", 2000.0, 0);
        Produto p2 = new Produto("321", "Teclado", 1000.0, 10);
        Produto p3 = new Produto("679", "Picanha", 26.4, 5);
        Produto p4 = new Produto("293", "Celular Samsung s7", 3250.5, 0);
        Produto p5 = new Produto("293", "Celular Samsung Galaxy s6", 3050.5, 0);
        Celular celular = new Celular("Iphone 7", "123456");
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        produtoNavigableSet.add(p1);
        produtoNavigableSet.add(p2);
        produtoNavigableSet.add(p3);
        produtoNavigableSet.add(p4);
        produtoNavigableSet.add(p5);
        for (Produto produto : produtoNavigableSet.descendingSet()){
            System.out.println(produto);
        }
        System.out.println("----------------------");
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(produtoNavigableSet.lower(p4));
    }
}
