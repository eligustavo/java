package main.javacore.Lclassesabstratas.classes;

public abstract class Pessoa {
    
    protected String nome;

    public abstract void print();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}