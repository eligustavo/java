package main.javacore.Vio.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTeste {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        //Try whit resources, um código menos e um pouco mais limpo.
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                BufferedReader br = new BufferedReader(new FileReader(file))) {
            bw.write("Escrevendo uma mensagem no arquivo");
            bw.newLine();
            bw.write("E pulando uma linha");
            bw.flush();
            bw.close();
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try {
        // FileWriter fw = new FileWriter(file);
        // BufferedWriter bw = new BufferedWriter(fw);

        // bw.write("Escrevendo uma mensagem no arquivo");
        // bw.newLine();
        // bw.write("E pulando uma linha");
        // bw.flush();
        // bw.close();

        // FileReader fr = new FileReader(file);
        // BufferedReader br = new BufferedReader(fr);
        // String s = null;
        // while ((s = br.readLine()) != null) {
        // System.out.println(s);
        // }
        // br.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
    }
}