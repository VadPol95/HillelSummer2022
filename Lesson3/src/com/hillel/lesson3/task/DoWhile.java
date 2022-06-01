package com.hillel.lesson3.task;

/**
 * Перепишите программы (1 и 2) с использованием цикла do while.
 */

public class DoWhile {
    public static void main(String[] args) {

        getNumbers();
        System.out.println("Factorial: " + getFactorial(5));

    }

    public static void getNumbers() {
        int i = 1;
        do {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
        while (i <= 99);

        System.out.println();
    }

    public static int getFactorial(int n) {
        int result = 1;
        int i = 1;
        do {
            result = result * i;
            i++;
        }
        while (i <= n);

        return result;
    }
}
