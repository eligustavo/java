package main.javacore.Bintroducaometodos.classes;

public class Estudante {

    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] getNotas() {
        return this.notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }

    public void imprimeAluno() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (this.notas != null) {
            for (double nota : this.notas) {
                System.out.print(nota + ", ");
            }
        }
    }

    public void media() {
        if (this.notas == null) {
            System.out.println("Esse aluno não possui notas");
            return;
        }

        double media = 0;
        for (double nota : this.notas) {
            media += nota;
        }
        media = media / this.notas.length;

        if (media >= 6) {
            this.aprovado = true;
            System.out.println("\nA média do aluno é: " + media + "\nsituação: aprovado");
        } else {
            this.aprovado = false;
            System.out.println("\nA média do aluno é: " + media + "\nsituação: reprovado");
        }
    }
}