package main.javacore.ZZEpadroesdeprojeto.teste;

import main.javacore.ZZEpadroesdeprojeto.classes.AviaoSingletonEnum;

public class AviaoSingletonEnumTeste {
    public static void main(String[] args) {
        AviaoSingletonEnum.agendarAssento("1A");
        AviaoSingletonEnum.agendarAssento("1A");
    }
}
