package main.javacore.ZZCthreads.classes;

public class Conta {
    
    private int saldo = 50;

    public int getSaldo(){
        return saldo;
    }

    public void saque(int valor){
        saldo = saldo - valor;
    }

}
