package org.example;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_3 {
    public static void main(String[] args) {
        String text = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},";
        Pattern pat = Pattern.compile("[а-яА-Я0-9]+");
        String txt = text.replace("фамилия", "Студент").replace("оценка", "получил").replace("предмет", "по предмету");
        StringBuilder result = new StringBuilder();

        Matcher matcher = pat.matcher(txt);
        while (matcher.find()){
            result.append(matcher.group() + " ");
        }

        System.out.println(result);

    }
}
