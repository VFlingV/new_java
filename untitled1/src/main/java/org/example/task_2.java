package org.example;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 *Реализуйте алгоритм сортировки пузырьком
 * числового массива, результат после каждой итерации запишите в лог-файл.
 *
 *
 *
 */
public class task_2 {
    private static final Logger logger = Logger.getLogger(task_2.class.getName());

    public static void main(String [] args) throws IOException {
        FileHandler log = new FileHandler("log.txt"); // нужен ли тут блок try?
        logger.addHandler(log);
        SimpleFormatter sformat = new SimpleFormatter();
        log.setFormatter(sformat);

        int [] numbers = {11, 3, 14, 16, 7, 22, 45, 1};
        boolean isSort = false;
        int num;

        while(!isSort) {
            isSort = true;

            for (int i = 0; i < numbers.length-1; i++) {
                if(numbers[i] > numbers[i+1]){
                    isSort = false;
                    num = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = num;
                    logger.info(Arrays.toString(numbers));
                }
            }
        }
    }

}
