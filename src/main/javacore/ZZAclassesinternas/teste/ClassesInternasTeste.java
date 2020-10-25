package main.javacore.ZZAclassesinternas.teste;

public class ClassesInternasTeste {

    private String nome = "Elivelton";

    class Interna {
        public void verClasseExterna() {
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {
        ClassesInternasTeste externa = new ClassesInternasTeste();
        ClassesInternasTeste.Interna in = externa.new Interna();
        ClassesInternasTeste.Interna in2 = new ClassesInternasTeste().new Interna();
        in2.verClasseExterna();
        in.verClasseExterna();
    }
}


//class Externa {
//    private String nome = "Elivelton";
//
//
//    class Interna{
//        public void verClasseExterna(){
//            System.out.println(nome);
//        }
//    }
//}