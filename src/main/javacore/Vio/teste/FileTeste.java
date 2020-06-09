package main.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste {
    public static void main(String[] args) {
        File f = new File("Arquivo.txt");
        try {
            System.out.println(f.createNewFile());
            boolean exists = f.exists();
            System.out.println("Permissão para leitura? " + f.canRead());
            System.out.println("path " + f.getPath());
            System.out.println("path completo " + f.getAbsolutePath());
            System.out.println("diretorio? " + f.isDirectory());
            System.out.println("hidden? " + f.isHidden());
            System.out.println("modificado? " + new Date(f.lastModified()));

            if (exists) {
                System.out.println("Deletado?" + f.delete());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}