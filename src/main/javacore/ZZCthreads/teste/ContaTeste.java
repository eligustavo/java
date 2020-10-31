package main.javacore.ZZCthreads.teste;

import main.javacore.ZZCthreads.classes.Conta;

public class ContaTeste implements Runnable {
    private Conta conta = new Conta();

    public static void main(String[] args) {
        ContaTeste cTeste = new ContaTeste();
        Thread elivelton = new Thread(cTeste, "Elivelton");
        Thread joao = new Thread(cTeste, "João");
        elivelton.start();
        joao.start();
        imprime();
    }

    public static void imprime(){
        synchronized (ContaTeste.class){
            System.out.println("alguma coisa");
        }
    }

    private void saque(int valor) {
        synchronized (conta) {
            if (conta.getSaldo() >= valor) {
                System.out.println(Thread.currentThread().getName() + " está indo sacar");
                conta.saque(valor);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " completou o saque, saldo: " + conta.getSaldo());
            } else {
                System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque, saldo: " + conta.getSaldo());
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if(conta.getSaldo() < 0){
                System.out.println("Oh meu deus!");
            }
        }
    }
}
