package main.javacore.Kenumeracoes.teste;

import main.javacore.Kenumeracoes.classes.Cliente;
import main.javacore.Kenumeracoes.classes.TipoCliente;

public class ClienteTeste {

    public static void main(String[] args) {
        Cliente c = new Cliente("Ana", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCliente.PESSOA_JURIDICA.getId());
        System.out.println(TipoCliente.PESSOA_FISICA.getId());
        System.out.println(c);
        
    }

}