package main.javacore.Ycolecoes.teste;

import main.javacore.Ycolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTeste {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto p1 = new Produto("123", "Laptop", 2000.0, 0);
        Produto p2 = new Produto("321", "Teclado", 1000.0, 10);
        Produto p3 = new Produto("679", "Picanha", 26.4, 5);
        Produto p4 = new Produto("293", "Celular Samsung", 3250.5, 0);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        Iterator<Produto> produtoIterator = produtos.iterator();
        //hasNext(); //next();
        while (produtoIterator.hasNext()) {
            Produto produto = produtoIterator.next();
            if (produto.getQtd() == 0) {
                produtoIterator.remove();
            }
        }
        System.out.println(produtos.size());
    }
}
