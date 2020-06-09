package main.javacore.Rstrings.teste;

public class StringTeste {
    public static void main(String[] args) {
        String nome = "Elivelton";
        nome = nome.concat(" Gustavo");
        System.out.println(nome);


        String teste = "Goku";
        String teste2 = "             0123456789              ";
        System.out.println(teste.charAt(3));
        System.out.println(teste.equalsIgnoreCase(teste2));
        System.out.println(teste.length());
        System.out.println(teste2.replace('a', 'o'));
        System.out.println(teste2.toLowerCase());
        System.out.println(teste.toUpperCase());
        System.out.println(teste2.substring(0, 5));
        System.out.println(teste2.trim());

    }

}