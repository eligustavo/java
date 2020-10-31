package main.javacore.ZZDConcorrencia.classes;

public class Entregador implements Runnable {
    private ListaMembros listaMembros;

    public Entregador(ListaMembros listaMembros){
        this.listaMembros = listaMembros;
    }

    @Override
    public void run() {
        String nomeThread = Thread.currentThread().getName();
        System.out.println(nomeThread + " Começando trabalho de entrega");
        int qtdPendente = listaMembros.getEmailsPendentes();
        boolean aberto = listaMembros.isAberto();
        while(aberto || qtdPendente > 0){
            try{
                String email = listaMembros.obterEmailMembro();
                if(email != null){
                    System.out.println(nomeThread + " enviando email para " + email);
                    Thread.sleep(2000);
                    System.out.println("Envio para " + email + " concluido com sucesso");
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            aberto = listaMembros.isAberto();
            qtdPendente = listaMembros.getEmailsPendentes();
        }
        System.out.println("Atividade finalizada");
    }
}
