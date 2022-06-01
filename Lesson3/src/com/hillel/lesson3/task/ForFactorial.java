package com.hillel.lesson3.task;

/**
 * Дано число n при помощи цикла for посчитать факториал n!
 */

public class ForFactorial {
    public static void main(String[] args) {
        System.out.println("Factorial: " + getFactorial(5));
    }

    public static int getFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;

        }
        return result;
    }
}
