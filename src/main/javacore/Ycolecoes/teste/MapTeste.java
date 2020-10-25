package main.javacore.Ycolecoes.teste;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTeste {
    public static void main(String[] args) {
//        Map<String, String> map = new HashMap<>(); // Não garante a ordem de inserção
        Map<String, String> map = new LinkedHashMap<>(); //  Mantem a ordem de inserção
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("Meza", "mesa");
//        for (String key : map.values()) {
//            System.out.println(key);
//        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
