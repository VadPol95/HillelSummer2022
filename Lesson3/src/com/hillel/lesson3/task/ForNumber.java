package com.hillel.lesson3.task;

/**
 * При помощи цикла for вывести на экран нечетные числа от 1 до 99.
 */

public class ForNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
