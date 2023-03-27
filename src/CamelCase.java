import java.io.StringWriter;
import java.util.Arrays;

public class CamelCase {
/*
     TASK ->
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin sadece ilk karakterlerini
            büyük harfe çevirip return eden  method create ediniz.
            input: I lIVe in uSa
            output: I Live In Usa

     */
    public static void main(String[] args) {
        System.out.println(camelCase("I lIVe in uSa"));


    }

    private static String camelCase(String iLIVeInUSa) {
        String[] words = iLIVeInUSa.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }


}