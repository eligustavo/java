package main.javacore.ZGenerics.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract class Animal {
    public abstract void consulta();
}

class Cachorro extends Animal implements Comparable {
    @Override
    public void consulta() {
        System.out.println("Consultando cachorro");
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

class Gato extends Animal {
    @Override
    public void consulta() {
        System.out.println("Consultando gato");
    }
}

public class WildCardTeste {
    public static void main(String[] args) {
        Cachorro[] cachorros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        //  consultaAnimais(cachorros);
        //  consultaAnimais(gatos);
        List<Cachorro> cachorroList = new ArrayList<>();
        cachorroList.add(new Cachorro());
        List<Gato> gatoList = new ArrayList<>();
        gatoList.add(new Gato());
        consultaAnimaisList(cachorroList);
        consultaAnimaisList(gatoList);
        ordernarLista(cachorroList);
    }

    public static void consultaAnimais(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
        //      animals[1] = new Gato();
    }

    // type erasure : ? = coringa
    public static void consultaAnimaisList(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    public static void consultarCachorrosList(List<? super Cachorro> cachorroList) {
        Cachorro c1 = new Cachorro();
        Animal c2 = new Cachorro();
        Object o = new Cachorro();
        cachorroList.add(new Cachorro());

    }
    public static void ordernarLista(List<? extends Comparable> lista){
        Collections.sort(lista);
    }

}
