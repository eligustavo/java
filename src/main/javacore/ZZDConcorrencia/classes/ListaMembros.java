package main.javacore.ZZDConcorrencia.classes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ListaMembros {
    private final Queue<String> emails = new LinkedList<>();
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition conditionLock = lock.newCondition();

    private boolean aberto = true;

    public int getEmailsPendentes() {
        lock.lock();
        try {
            return this.emails.size();
        } finally {
            lock.unlock();
        }
    }

    public boolean isAberto() {
        return aberto;
    }

    public String obterEmailMembro() {
        String email = null;
        try {
            lock.lock();
            while (this.emails.size() == 0) {
                if (!aberto) return null;
                System.out.println("Lista vazia, colocando a thread: " + Thread.currentThread().getName() + " em modo wait");
                conditionLock.await();
            }
            email = this.emails.poll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        return email;
    }

    public void addEmailMembro(String email) {
        lock.lock();
        try {
            this.emails.add(email);
            System.out.println("Email adicionado na lista");
            System.out.println("Notificando as threads que estão em espera");
            conditionLock.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void fecharLista() {
        System.out.println("Notificando todas as threads e fechando a lista");
        aberto = false;
        lock.lock();
        try {
            this.emails.notifyAll();
        } finally {
            lock.unlock();
        }
    }
}
