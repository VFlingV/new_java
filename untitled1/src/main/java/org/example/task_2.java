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
        Queue<Integer> ls = new LinkedList<>();
        int dip = 10;
        int a = 5;
        for (int i = 0; i < dip +1; i++){
            ls.add(i);
        }

        System.out.println("результат метода enqueue " + enqueue(ls));

        System.out.println("результат метода dequeue " + dequeue(ls));
        ls.remove(dequeue(ls));
        System.out.println(ls);

        System.out.println(ls.peek());
        System.out.println(ls);



    }

    public static<Integer> Queue<java.lang.Integer> enqueue(Queue<java.lang.Integer> list){
        Scanner read = new Scanner(System.in);
        System.out.println("Введите элемент который хотите переместить : ");

        int a = read.nextInt();
        list.remove(a);
        list.add(a);
    return list;
    }

    public static<Integer> int first(Queue<java.lang.Integer> list){

        int a = list.peek();
        return a;

    }

    public static<Integer> int dequeue(Queue<java.lang.Integer> list){

        int a = list.poll();
        return a;

    }

}
