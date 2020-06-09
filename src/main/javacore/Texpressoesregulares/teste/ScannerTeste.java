package main.javacore.Texpressoesregulares.teste;

import java.util.Scanner;

public class ScannerTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner("1 true 100 oi");

        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        System.out.println("#####################################");

        Scanner sc2 = new Scanner("1 true 100 oi");
        while (sc2.hasNext()) {
            if (sc2.hasNextInt()) {
                int i = sc2.nextInt();
                System.out.println(i);
            } else if (sc2.hasNextBoolean()) {
                boolean b = sc2.nextBoolean();
                System.out.println(b);
            } else {
                System.out.println(sc2.next());
            }
        }
    }
}