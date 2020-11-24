package main.javacore.ZZGlambdas.testes;

import main.javacore.ZZGlambdas.classes.Carro;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.*;

import static java.util.Arrays.asList;

public class LambdaTeste2 {
    public static void main(String[] args) {
        forEach(asList("Elivelton", "Gustavo", "facebook.com/teste"), (String s) -> System.out.println(s));
        List<Integer> list = map(asList("Elivelton", "Gustavo", "facebook.com/teste"), (String s) -> s.length());
        List<Carro> carros = asList(new Carro("preto", 2011), new Carro("preto", 2011), new Carro("preto", 2011));
        List<String> listCores = map(carros, (Carro c) -> c.getCor());
        System.out.println(listCores);
        System.out.println(list);
        Predicate<Integer> pares = (Integer i) -> i % 2 == 0;
        IntPredicate impares = (int i) -> i % 2 != 0;
        System.out.println(pares.test(1000));
        System.out.println(impares.test(1000));
        String cor = "Vermelho";
        Predicate<String> p = (String s) -> listCores.add(s);
        Consumer<String> b = s -> listCores.add(cor);
        b.accept("AMARELO");

        System.out.println(listCores);
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T e : list) {
            c.accept(e);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            result.add(f.apply(e));
        }
        return result;
    }

}

