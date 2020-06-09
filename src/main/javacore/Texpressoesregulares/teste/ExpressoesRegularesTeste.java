package main.javacore.Texpressoesregulares.teste;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularesTeste {
    public static void main(String[] args) {
        // \d Todos os digitos
        // \D Tudo oque não for digito
        // \s Espaços em branco \t \n \f \r
        // \S caractere que não é branco
        // \w caracteres de palavras a-z A-Z, dígitos e _
        // \W tudo que não for caractere de palavra
        // []
        // ? zero ou uma ocorrencia
        // * zero ou mais ocorrencias
        // + uma ou mais ocorrencias
        // {n,m} de n até m ocorrencias
        // { }
        // |
        // $
        // . coringa
        // ^ [^abc]

        // o{V|C}o = ovo, oco
        // maca{rr|c}ão= macarrão ou macacão

        // String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        // String texto = "12 0x 0X 0xFFABC 0X10G 0x1";

        // String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //
        // "([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+
        // String texto = "fulano@gmail.com, 120Abc@hotmail.com, @!abrao@mail,
        // teste@gmail.com.br, teste@mail.com";

        // String regex = "\\d{2}/\\d{2}/\\d{2,4}"; //
        // "([\\w\\.])+@([a-zA-Z])+(\\.([a-zA-Z])+)+
        // String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95"; // dd/MM/yyyy

        String regex = "proj([^,])";
        String texto = "proj1.bkp, proj1.java, proj1final.java, proj2.bkp, proj3.java, diagrama, fotos";

        System.out.println("Email válido? " + "@!abrao@mail".matches(regex));
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("texto: " + texto);
        System.out.println("índice: 0123456789");
        System.out.println("expressão: " + matcher.pattern());
        System.out.println("posiçoes encontradas");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}