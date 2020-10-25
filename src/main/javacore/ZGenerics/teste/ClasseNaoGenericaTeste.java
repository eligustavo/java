package main.javacore.ZGenerics.teste;

import main.javacore.ZGenerics.classes.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTeste {
    public static void main(String[] args) {
        CarroAlugado carroAlugado = new CarroAlugado();
        Carro carroAlugavel = carroAlugado.getCarroDisponivel();
        System.out.println("Usando o carro por um mes");
        carroAlugado.devolverCarro(carroAlugavel);
    }
}

class CarroAlugado {
    private List<Carro> carrosDisponiveis = new ArrayList<>();

    {
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
    }

    //Alugar
    public Carro getCarroDisponivel() {
        Carro c = carrosDisponiveis.remove(0);
        System.out.println("Alugando carro: " + c);
        return c;
    }

    public void devolverCarro(Carro c) {
        System.out.println("Devolvendo carro: " + c);
        carrosDisponiveis.add(c);
        System.out.println("Carros disponiveis: " + carrosDisponiveis);
    }

}