package main.javacore.Fmotidicadorestatico.teste;

import main.javacore.Fmotidicadorestatico.classes.Carro;

public class CarroTeste {

    public static void main(String[] args) {
        Carro.setVelocidadeLimite(220);
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Audi", 270);
        Carro carro3 = new Carro("Ferrari", 290);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

        System.out.println("##############################");

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();

    }
}