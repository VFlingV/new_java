package org.example;



import java.util.ArrayList;
import java.util.Arrays;

/**
 Реализовать алгоритм сортировки слиянием.
*/
public class task_1 {

    public static void main(String[] args) {
        int[] listNum = {5, 6, 8, 2, 3, 1, 4, 2, 9, 0};
        int[] result = sort(listNum);

        System.out.println(Arrays.toString(result));

    }

    public static int[] sort(int[] array) {
        if (array == null) {
            return null;
        }
        if (array.length < 2) {
            return array;
        }
        // отделяем лев.часть
        int[] array_a = new int[array.length / 2];
        System.arraycopy(array, 0, array_a, 0, array.length / 2);
        // отделяем прав.часть
        int[] array_b = new int[array.length - array_a.length];
        System.arraycopy(array, array_a.length, array_b, 0, array.length - array_a.length);

        sort(array_a);
        sort(array_b);

        merge(array, array_a, array_b);

        return array;
    }

    private static void merge(int[] array, int[] array_a, int[] array_b) {

        int pos_a = 0;
        int pos_b = 0;

        for (int i = 0; i < array.length; i++) {
            if (pos_a == array_a.length) {
                array[i] = array_b[pos_b];
                pos_b++;
            } else if (pos_b == array_b.length) {
                array[i] = array_a[pos_a];
                pos_a++;
            } else if (array_a[pos_a] < array_b[pos_b]) {
                array[i] = array_a[pos_a];
                pos_a++;
            } else {
                array[i] = array_b[pos_b];
                pos_b++;
            }
        }
    }
}

