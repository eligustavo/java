package main.javacore.Ycolecoes.teste;

import main.javacore.Ycolecoes.classes.Produto;

import java.util.*;


class ProdutoNomeComparator implements Comparator<Produto> {

    @Override
    public int compare(Produto o1, Produto o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}


public class SortProdutoTeste {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Produto[] produtosArray = new Produto[4];

        Produto p1 = new Produto("123", "Laptop", 200.0);
        Produto p2 = new Produto("321", "Teclado", 100.0);
        Produto p3 = new Produto("679", "Picanha", 26.4);
        Produto p4 = new Produto("293", "Celular Samsung", 3250.5);
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);
        produtosArray[0] = p1;
        produtosArray[1] = p2;
        produtosArray[2] = p3;
        produtosArray[3] = p4;
        Collections.sort(produtos, new ProdutoNomeComparator());
//        for (Produto produto : produtos) {
//            System.out.println(produto);
//        }
        Arrays.sort(produtosArray, new ProdutoNomeComparator());
        for (Produto produto:produtosArray) {
            System.out.println(produto);
        }

    }
}
