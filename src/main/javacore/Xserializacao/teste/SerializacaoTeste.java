package main.javacore.Xserializacao.teste;

import java.io.*;

import main.javacore.Xserializacao.classes.Aluno;
import main.javacore.Xserializacao.classes.Turma;

public class SerializacaoTeste {
    public static void main(String[] args) {
        gravadorObjeto();
        leitorObjeto();
    }

    private static void gravadorObjeto() {
        Turma t = new Turma("Turma de teste");
        Aluno aluno = new Aluno(1L, "Elivelton", "123456");
        aluno.setTurma(t);
        try (ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("aluno.ser"))) {
            oss.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leitorObjeto() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aluno.ser"))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}