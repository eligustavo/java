package main.javacore.ZZBjdbc.teste;

import main.javacore.ZZBjdbc.classes.Comprador;
import main.javacore.ZZBjdbc.db.CompradorDBOld;

import java.sql.SQLException;
import java.util.List;

public class TesteConexao {
    public static void main(String[] args) {
//        atualizar();
//        List<Comprador> compradorList = buscaPorNome("ri");
//        System.out.println(compradorList);
//        CompradorDB.selectMetaData();
//        CompradorDB.checkDriverStatus();
//        CompradorDB.testTypeScroll();
//        CompradorDB.updateNomesToLowerCase();
//        System.out.println(CompradorDB.searchByNameCallableStatement("oao"));
//        System.out.println(CompradorDB.searchByNameRowSet("oao"));
//        CompradorDB.updateRowSetCached(new Comprador(1,"011.011.011-01", "Prepared Statement da Silva"));
        try {
            CompradorDBOld.saveTransaction();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserir() {
        Comprador comprador = new Comprador("111.111.111-11", "José");
        CompradorDBOld compradorDBOld = new CompradorDBOld();
        compradorDBOld.save(comprador);
    }

    public static void deletar() {
        Comprador comprador = new Comprador();
        comprador.setId(2);
        CompradorDBOld.delete(comprador);
    }

    public static void atualizar() {
        Comprador comprador = new Comprador(1, "000.000.000-11", "MARIA");
        CompradorDBOld.update(comprador);
    }

    public static List<Comprador> selecionarTudo() {
        return CompradorDBOld.selectAll();
    }

    public static List<Comprador> buscaPorNome(String nome) {
        return CompradorDBOld.searchByName(nome);
    }

}
