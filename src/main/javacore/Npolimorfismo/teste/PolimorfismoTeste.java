package main.javacore.Npolimorfismo.teste;

import main.javacore.Npolimorfismo.classes.Gerente;
import main.javacore.Npolimorfismo.classes.RelatorioPagamento;
import main.javacore.Npolimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {

        Gerente g = new Gerente("Gerente", 5000, 2000);
        Vendedor v = new Vendedor("Vendedor", 2000, 20000);
        RelatorioPagamento relatorio = new RelatorioPagamento();
        // relatorio.relatorioPagamentoGerente(g);
        // System.out.println("=================================================");
        // relatorio.relatorioPagamentoVendedor(v);
        relatorio.relatorioPagamentoGenerico(g);
        System.out.println("=================================================");
        relatorio.relatorioPagamentoGenerico(v);

    }
}