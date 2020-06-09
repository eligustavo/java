package main.javacore.Oexception.runtimeexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRunTimeExceptionTeste {
    public static void main(String[] args) {
        try {
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e) {
            System.out.println("Dentro do MultiException");
        }
        System.out.println("Final do programa");

        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {

        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}