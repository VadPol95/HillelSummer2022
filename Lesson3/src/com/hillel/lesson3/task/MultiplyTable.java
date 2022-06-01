package com.hillel.lesson3.task;

/**
 * Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10)
 */

public class MultiplyTable {

    public static void main(String[] args) {
        multiply();
    }

    public static void multiply() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);

            }
            System.out.println();

        }
    }
}
