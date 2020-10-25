package main.javacore.ZGenerics.teste;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("String");
        lista.add("String");
        lista.add("Elivelton Gustavo");

        for (String obj : lista) {
            System.out.println(obj);
        }
        add(lista, 1L);
    }

    public static void add(List lista, Long l) {
        lista.add(l);
    }

}
