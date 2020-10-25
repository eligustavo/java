package main.javacore.Ycolecoes.teste;

import main.javacore.Ycolecoes.classes.Consumidor;
import main.javacore.Ycolecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTeste {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("Elivelton Gustavo", "111");
        Consumidor consumidor2 = new Consumidor("Empresa Fantasia", "122");
        Produto p1 = new Produto("123", "Laptop", 200.0);
        Produto p2 = new Produto("321", "Teclado", 100.0);
        Produto p3 = new Produto("679", "Picanha", 26.4);
        Produto p4 = new Produto("293", "Celular Samsung", 3250.5);

        Map<Consumidor, List<Produto>> map = new HashMap<>();

        List<Produto> produtoCon1 = new ArrayList<>();
        produtoCon1.add(p1);
        produtoCon1.add(p2);
        List<Produto> produtoCon2 = new ArrayList<>();
        produtoCon2.add(p3);
        produtoCon2.add(p4);

        map.put(consumidor, produtoCon1);
        map.put(consumidor2, produtoCon2);
        for (Map.Entry<Consumidor, List<Produto>> entry : map.entrySet()) {
            System.out.println(entry.getKey().getNome());
            for (Produto produto : entry.getValue()) {
                System.out.println(produto.getNome());
            }
        }
    }
}
