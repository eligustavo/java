package main.javacore.Aintroducaoclasses.teste;

import main.javacore.Aintroducaoclasses.classes.Carro;

public class CarroTeste {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.modelo = "teste";
        carro.placa = "gwf1254";
        carro.velocidadeMaxima = 120F;

        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima);

    }

}