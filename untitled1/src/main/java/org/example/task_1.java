package org.example;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */

public class task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> ls = new LinkedList<>();
        LinkedList<String> ls_t = new LinkedList<>();
        int dip = 10;

        for (int i = 0; i < dip +1; i++){
            ls.add(i);
        }

        for (int i = 0; i < dip +1; i++){
            ls_t.add("a" + String.valueOf(i));
        }

        System.out.println(ls);
        System.out.println(reverseLs(ls));

        System.out.println(ls_t);
        System.out.println(reverseLs(ls_t));
    }
    public static<T> List<T> reverseLs(List<T> list){
        LinkedList<T> ls = new  LinkedList<>(list);
        Collections.reverse(ls);
        return ls;
    }
}
