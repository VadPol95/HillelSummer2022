package com.hillel.lesson2.task;

/**
 * Программа, которая находит среднее арифметическое значение двух чисел
 */

public class Task1 {
    public static void main(String[] args) {
        double[] num = {53,52};
        double result = 0;

        for (double average : num) {
            result += average;
        }
        System.out.println("Average: " + result / num.length);
    }
}
