package main.javacore.Aintroducaoclasses.teste;

import main.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTete {
    
    public static void main(String[] args){

        Professor professor = new Professor();

        professor.nome = "Kakashi";
        professor.matricula = 1234;
        professor.rg = "9589923";
        professor.cpf = "1103523165"; 

        System.out.println(professor.nome);
        System.out.println(professor.cpf);
        System.out.println(professor.rg);
        System.out.println(professor.matricula);

    }
}