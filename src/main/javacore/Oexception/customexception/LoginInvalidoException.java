package main.javacore.Oexception.customexception;

public class LoginInvalidoException extends Exception {
    private static final long serialVersionUID = 3534114347604604190L;

    public LoginInvalidoException() {
        super("Usuário ou senha inválidos");
    }

}