package main.javacore.ZZGlambdas.testes;

import main.javacore.ZZGlambdas.classes.Carro;
import main.javacore.ZZGlambdas.interfaces.CarroPredicate;

public class LambdaTeste {
    //anonima     //function     //passada por ai     //concisa
    //(Carro c) -> c.getCor().equals("verde");
    //(String s) -> s.length();
    //(int a, int b) -> (sout(a+b));
    public static void main(String[] args) {

        CarroPredicate carroPredicate = new CarroPredicate() {
            @Override
            public boolean test(Carro carro) {
                return carro.getCor().equals("verde");
            }
        };
        CarroPredicate carroPredicate1 = (Carro carro) -> carro.getCor().equals("verde");
        System.out.println(carroPredicate.test(new Carro("verde", 2010)));
        System.out.println(carroPredicate1.test(new Carro("verde", 2010)));
        Runnable runnable = () -> System.out.println("Dentro do run");
        new Thread(runnable).start();
    }
       
}