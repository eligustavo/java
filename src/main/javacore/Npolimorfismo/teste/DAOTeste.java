package main.javacore.Npolimorfismo.teste;

import main.javacore.Npolimorfismo.classes.ArquivoDAOImpl;

public class DAOTeste {
    public static void main(String[] args) {
        
        ArquivoDAOImpl arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();

    }
}