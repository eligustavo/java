package main.javacore.Aintroducaoclasses.teste;

import main.javacore.Aintroducaoclasses.classes.Estudante;

public class EstudanteTeste {
    
    public static void main(String[] args) {
        
        Estudante estudante = new Estudante();
        estudante.nome = "João";
        estudante.matricula = "132";
        estudante.idade = 15;

        System.out.println(estudante.nome);
        System.out.println(estudante.matricula);
        System.out.println(estudante.idade);

    }
}