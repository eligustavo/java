package main.javacore.Ycolecoes.teste;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class SortListTeste {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Elivelton");
        nomes.add("Gustavo");
        nomes.add("João");
        nomes.add("Gabriel");
        nomes.add(0, "Anna");
        Collections.sort(nomes);
        List<Double> numeros = new ArrayList<>();
        numeros.add(1.5);
        numeros.add(1.3);
        numeros.add(1.9);
        numeros.add(2d);
        numeros.add(0.9);
        Collections.sort(numeros);
        for (String nome : nomes) {
            System.out.println(nome);
        }
        for (Double numero : numeros) {
            System.out.println(numero);
        }
    }

}
