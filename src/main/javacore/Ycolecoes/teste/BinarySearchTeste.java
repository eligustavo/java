package main.javacore.Ycolecoes.teste;

import main.javacore.Ycolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTeste {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        // {-(ponto de inserção) -1}, -1 -1 -2
        Collections.sort(numeros);
        // 0,1,2,3,
        // 0,2,3,4
        System.out.println(Collections.binarySearch(numeros, 1));

        List<Produto> produtos = new ArrayList<>();

        Produto p1 = new Produto("123", "Laptop", 200.0);
        Produto p2 = new Produto("321", "Teclado", 100.0);
        Produto p3 = new Produto("679", "Picanha", 26.4);
        Produto p4 = new Produto("293", "Celular Samsung", 3250.5);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        Collections.sort(produtos, new ProdutoNomeComparator());
        Produto p5 = new Produto("000", "Antena", 50.5);
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println(Collections.binarySearch(produtos, p5, new ProdutoNomeComparator()));
        Integer[] arrayInteger = new Integer[4];
        arrayInteger[0] = 2;
        arrayInteger[1] = 0;
        arrayInteger[2] = 4;
        arrayInteger[3] = 3;
        Arrays.sort(arrayInteger);
        System.out.println(Arrays.binarySearch(arrayInteger,1));
    }
}
