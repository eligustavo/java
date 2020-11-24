package main.javacore.ZZGlambdas.testes;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws IOException {
        final int x = 7;
        int line;

        for (int i = 0; i < x; i++) {
            line = (int) pascal(i);
            System.out.println(line);
        }

    }

    static double pascal(int p) {
        double r = Math.pow(11, p);
        return r;

    }

}
