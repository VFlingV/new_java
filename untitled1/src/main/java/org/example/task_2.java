package org.example;


import java.util.ArrayList;

/**
 Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */


public class task_2 {
    public static void main(String[] args) {
        ArrayList <Integer> listNum = new ArrayList<>();
        ArrayList <Integer> resultNum = new ArrayList<>();

        int dip = 100;

        for (int i = 0; i < dip + 1; i++){
            int randNum = (int) ( Math.random() * dip );
            listNum.add(randNum);
        }
        for (int i : listNum){
            if (i % 2 != 0 ){
                resultNum.add(i);
            }
        }
        System.out.println(listNum);
        System.out.println(resultNum);
    }
}