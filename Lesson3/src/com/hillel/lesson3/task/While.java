package com.hillel.lesson3.task;

/**
 * Перепишите программы (1 и 2) с использованием цикла while.
 */

public class While {

    public static void main(String[] args) {

        getNumbers();
        System.out.println("Factorial: " + getFactorial(5));

    }
    public static void getNumbers(){
        int i = 1;
        while (i <= 99) {
            if (i % 2 == 1) {
                System.out.println(i);

            }
            i++;
        }
        System.out.println();
    }
    public static int getFactorial(int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result = result * i;
            i++;
        }

        return result;
    }
}
