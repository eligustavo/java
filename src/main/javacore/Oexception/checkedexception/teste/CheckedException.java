package main.javacore.Oexception.checkedexception.teste;

import java.io.File;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
     abrirArquivo();
    }

    public static void criarArquivo() throws IOException {
        File file = new File("Teste.txt");
        try {
            System.out.println("Arquivo foi criado: " + file.createNewFile());
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void abrirArquivo() {
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando leitura do arquivo");
            throw new Exception();
            // System.out.println("Escrevendo no arquivo");
        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();
        } finally {

            System.out.println("Fechar o arquivo");
        }
    }
}