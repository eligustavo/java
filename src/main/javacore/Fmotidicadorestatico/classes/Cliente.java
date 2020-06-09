package main.javacore.Fmotidicadorestatico.classes;

public class Cliente {
    /**
     * 0 - Bloco de inicialização estático é executado quando a JVM carregar a classe(é executado apenas 1x);
     * 1 - Alocado espaço na memoria para o objeto que será criado; 
     * 2 - Cada atributo de classe é criado e inicializado com seus valores default ou
     * valores explicitos; 
     * 3 - bloco de inicialização é executado; 
     * 4 - o construtor é executado;
     */
    private static int[] parcelas;
  
    //Bloco de inicialização
    static {
        parcelas = new int[100];
        System.out.println("Dentro do bloco de inicialização estatico");
        for (int i = 1; i <= 100; i++) {
            parcelas[i - 1] = i;
        }
    }

    public Cliente() {
    }

    public static int[] getParcelas() {
        return parcelas;
    }
}