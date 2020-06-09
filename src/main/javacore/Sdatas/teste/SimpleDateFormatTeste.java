package main.javacore.Sdatas.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateFormatTeste {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        String mascara = "yyyy.MM.dd G 'às' HH:mm:ss z";
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        System.out.println(formatador.format(c.getTime()));
    }
}