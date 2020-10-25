package main.javacore.Ycolecoes.teste;

import main.javacore.Ycolecoes.classes.Celular;

public class EqualsTeste {
    public static void main(String[] args) {
        Celular c1 = new Celular("Iphone", "123456");
        Celular c2 = new Celular("Iphone", "123456");

        System.out.println(c1.equals(c2));

    }
}