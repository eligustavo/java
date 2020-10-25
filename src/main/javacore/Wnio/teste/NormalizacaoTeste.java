package main.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTeste {
    public static void main(String[] args) {
        String diretorioProjeto = "curso-java-completo\\home\\elivelton\\dev";
        String arquivoTxt = "..\\..\\arquivo.txt";

        Path p1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(p1);
        System.out.println(p1.normalize());

        Path p2 = Paths.get("a/./b/./c");
        System.out.println(p2);
        System.out.println(p2.normalize());
    }
}