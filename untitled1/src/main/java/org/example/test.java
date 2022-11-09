package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner command = new Scanner(System.in);
        System.out.println("Введите элемент функцию: ");
        Queue<Integer> ls = new LinkedList<>();
        int dip = 10;
        int a = 5;
        for (int i = 0; i < dip + 1; i++) {
            ls.add(i);
        }
    }
}
