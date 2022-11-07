package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test_3 {
    public static void main(String[] args) {
        int pos;
        String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        Pattern pat = Pattern.compile("[a-z:A-Z0-9,]+");
        String [] txt = text.split(" ");
        StringBuilder result = new StringBuilder();
        int count = 0;
        int i = txt.length;

        for (String s : txt){
            if ((pos = s.indexOf("null")) != - 1){
                continue;
            }
            else {

                Matcher matcher = pat.matcher(s);
                while (matcher.find()){
                    if(count == i){
                        result.append(matcher.group().replace(":", "=").replace(",", "") + " ");
                    }
                    else {
                        result.append(matcher.group().replace(":", "=").replace(",", "AND") + " ");
                    }


                }
                i--;
                count++;
            }
        }
        System.out.println(result);
    }
}
