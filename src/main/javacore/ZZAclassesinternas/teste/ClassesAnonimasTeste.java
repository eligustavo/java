package main.javacore.ZZAclassesinternas.teste;

import main.javacore.ZGenerics.classes.Carro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Animal {
    public void andar() {
        System.out.println("Animal andando");
    }

    public void comer(){
        System.out.println("comendo");
    }
}

public class ClassesAnonimasTeste {
    public static void main(String[] args) {
        Animal a = new Animal() {
            public void andar() {
                System.out.println("Andando anonimamente");
            }
        };
        a.andar();
        a.comer();

        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("BMW"));
        carros.add(new Carro("Audi"));
        Collections.sort(carros, new Comparator<Carro>() {
            @Override
            public int compare(Carro o1, Carro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
        System.out.println(carros);
    }
}

class CarroComparator implements Comparator<Carro>{

    @Override
    public int compare(Carro o1, Carro o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
}