package main.javacore.Ycolecoes.classes;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private String serialNumber;
    private String nome;
    private Double preco;
    private int qtd;

    public Produto(String serialNumber, String nome, Double preco, int qtd) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
    }

    public Produto(String serialNumber, String nome, Double preco) {
        this.serialNumber = serialNumber;
        this.nome = nome;
        this.preco = preco;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(serialNumber, produto.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "serialNumber= " + serialNumber + '\'' +
                ", nome= " + nome + '\'' +
                ", preco= " + preco +
                ", qtd= " + qtd +
                "}";
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public int compareTo(Produto outroObjeto) {
        //negativo se thisObject < outroObjeto
        //Zero se thisObject == outroObjeto
        //Positivo se thisObject > outroObjeto
        Double d = preco;
        return this.preco.compareTo(outroObjeto.getPreco());
    }
}
