package main.javacore.ZZAclassesinternas.teste;

public class ClassesLocaisTeste {
    private String nome = "Elivelton";

    public void fazAlgo() {
        final String sobrenome = "Gustavo";
        class Interna {
            public void imprimeNomeExterno() {
                System.out.println(nome);
            }
        }
        Interna in = new Interna();
        in.imprimeNomeExterno();
    }

    public static void main(String[] args) {
        ClassesLocaisTeste externa = new ClassesLocaisTeste();
        externa.fazAlgo();
    }
}
