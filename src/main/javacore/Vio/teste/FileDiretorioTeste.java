package main.javacore.Vio.teste;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTeste {
    public static void main(String[] args) throws IOException {
        // File diretorio = new File("folder");
        // boolean mkdir = diretorio.mkdir();
        // System.out.println("Diretório criado " + mkdir);
        // File arquivo = new File(diretorio, "arquivo.txt");
        // boolean newFile = arquivo.createNewFile();
        // System.out.println("Arquivo criado " + newFile);

        // File arquivoNovoNome = new File(diretorio, "arquivo renomeado.txt");
        // boolean renamed = arquivo.renameTo(arquivoNovoNome);
        // System.out.println("Renomeado " + renamed);
        // File diretorioRenomeado = new File("folder2");
        // boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
        // System.out.println("Diretorio renomeado: " + diretorioRenamed);

        buscarArquivos();

    }

    public static void buscarArquivos(){
        File file = new File("C:\\Users\\elive\\OneDrive\\Documentos\\curso-java-completo\\folder2");
        String[] list= file.list();
        for (String arquivo : list) {
            System.out.println(arquivo);
        }
    }

}