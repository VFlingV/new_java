package org.example;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 *2
 */
public class task_2 {
    public static void main(String[] args) {
        Scanner rd= new Scanner(System.in);
        System.out.println("Введите элемент функцию: ");
        String command = rd.next();
        Queue<Integer> ls = new LinkedList<>();
        int dip = 10;
        int a = 5;
        for (int i = 0; i < dip +1; i++){
            ls.add(i);
        }

        if (command.equals("enqueue")){
            Scanner read = new Scanner(System.in);
            System.out.println("Введите элемент который хотите переместить : ");
            a = read.nextInt();
            ls.remove(a);
            ls.add(a);
            System.out.println("результат метода enqueue " + ls);

        } else if ((command.equals("first"))) {
            int b = ls.peek();
            System.out.println("результат метода first " + ls.peek());
            System.out.println(ls);

        } else if ((command.equals("dequeue"))) {
            int c = ls.poll();
            System.out.println("результат метода dequeue " + c);
            System.out.println(ls);
        }

    }

}
