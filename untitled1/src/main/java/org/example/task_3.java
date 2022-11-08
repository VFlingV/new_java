package org.example;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

/**
 Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
 */


public class task_3 {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        int dip = 5;

        for (int i = 0; i < dip + 1; i++) {
            int randNum = (int) (Math.random() * dip);
            listNum.add(randNum);
        }
        System.out.println(listNum);
        int sum = listNum.stream().mapToInt(Integer::intValue).sum();
        int average = sum / listNum.size();
        int max = Collections.max(listNum);
        int min = Collections.min(listNum);
        System.out.println("max = " + max + "\n"+ "min = " + min + "\n" + "average = " + average);

    }
}