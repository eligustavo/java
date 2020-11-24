package main.javacore.ZZEpadroesdeprojeto.teste;

import main.javacore.ZZEpadroesdeprojeto.classes.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("William")
                .nomeDoMeio("Suane")
                .ultimoNome("Queiroz")
                .nomeDoPai("William")
                .apelido("JirayaBolado")
                .build();
        System.out.println(p);
    }
}
