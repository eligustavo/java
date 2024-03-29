package main.javacore.ZZCthreads.teste;

import main.javacore.ZZCthreads.classes.Entregador;
import main.javacore.ZZCthreads.classes.ListaMembros;

import javax.swing.*;

public class EntregadorTeste {
    public static void main(String[] args) {
        ListaMembros listaMembros = new ListaMembros();
        Thread t1 = new Thread(new Entregador(listaMembros), "Entregador 1");
        Thread t2 = new Thread(new Entregador(listaMembros), "Entregador 2");
        t1.start();
        t2.start();
        while(true){
            String email = JOptionPane.showInputDialog("Digite o email do membro");
            if(email == null || email.isEmpty()){
                listaMembros.fecharLista();
                break;
            }
            listaMembros.addEmailMembro(email);
        }
    }
}
