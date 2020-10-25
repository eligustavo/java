package main.javacore.Ycolecoes.teste;

import main.javacore.Ycolecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTeste {
    public static void main(String[] args) {
        Celular c1 = new Celular("Galaxy S7", "1234567");
        Celular c2 = new Celular("Iphone 6S", "7845298");
        Celular c3 = new Celular("Nokia 1100", "87898762");

        List<Celular> celularList = new ArrayList<>();
        celularList.add(c1);
        celularList.add(c2);
        celularList.add(c3);
        for (Celular celular : celularList) {
            System.out.println(celular);
        }
        Celular c4 = new Celular("Galaxy S7", "1234567");
        System.out.println(celularList.contains(c4));
    }
}
