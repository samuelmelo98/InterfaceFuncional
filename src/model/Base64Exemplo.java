package model;

import java.util.Base64;

public class Base64Exemplo {
   static String str = "test text";

    public static void main(String[] args) {
        try{
            System.out.println(str);
            //Codifica
            String textCripto =  Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
            System.out.println(textCripto);
            //Decodifica
           String textDescri = new String(Base64.getDecoder().decode(textCripto));
            System.out.println(textDescri);
        } catch (Exception e ){
            e.printStackTrace();
        }
    }
}
