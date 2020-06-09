package main.javacore.Sdatas.teste;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTeste {
    public static void main(String[] args) {
        Locale locPort = new Locale("en", "UK");
        Locale locBr = new Locale("pt", "BR");
        Calendar c = Calendar.getInstance();
        c.set(2020, Calendar.MAY, 28);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locPort);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locBr);
        
        System.out.println(df.format(c.getTime()));
        System.out.println(df2.format(c.getTime()));
    }
}