package main.javacore.Npolimorfismo.classes;

public class DatabaseDAOimpl implements GenericDAO {

    @Override
    public void save() {
        System.out.println("Salvando dados no banco de dados");
    }

}