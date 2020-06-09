package main.javacore.Texpressoesregulares.teste;

public class TokenTeste {
    public static void main(String[] args) {
        String str = "elivelton, joão, josé, pedro, anna";
        String[] tokens = str.split(",");
        for(String arr: tokens){
            System.out.println(arr.trim());
        }

    }
}