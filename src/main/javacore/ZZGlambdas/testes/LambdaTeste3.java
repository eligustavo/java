package main.javacore.ZZGlambdas.testes;

import main.javacore.ZZGlambdas.classes.Carro;
import main.javacore.ZZGlambdas.classes.ComparadorCarro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import static java.util.Arrays.asList;

public class LambdaTeste3 {
    public static void main(String[] args) {
        forEach(asList("Elivelton", "Gustavo", "facebook.com/teste"), System.out::println);
        List<Carro> carros = asList(new Carro("Amarelo", 2015), new Carro("azul", 2006), new Carro("preto", 2011));
        //Reference to a static method
        Collections.sort(carros, ComparadorCarro::compareByColor);
        System.out.println(carros);
        //Reference to an instance method of a particular object
        ComparadorCarro comparadorCarro = new ComparadorCarro();
        Collections.sort(carros, comparadorCarro::comparePorAno);
        System.out.println(carros);
        //Reference to an instance method of an arbitrary object of a particular type
        List<String> nomes = asList("Joao", "Maria", "Anna", "Pedro");
        nomes.sort((s1, s2) -> s1.compareTo(s2));
        nomes.sort(String::compareTo);
        System.out.println(nomes);
        Function<String, Integer> stringToInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringInteger2 = Integer::parseInt;
        BiPredicate<List<String>, String> contains = (lista, elemento) -> lista.contains(elemento);
        BiPredicate<List<String>, String> contains2 = List::contains;
        System.out.println(stringInteger2.apply("15"));
        System.out.println(contains2.test(nomes, "Joao"));
        //Reference to a constructor
        Supplier<ComparadorCarro> comparadorCarroSupplier = ComparadorCarro::new;
        
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
