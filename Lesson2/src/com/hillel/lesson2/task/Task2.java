package com.hillel.lesson2.task;

/**
 * Программа, которая находит среднее арифметическое значение произвольного количества цифр
 */

public class Task2 {
    public static void main(String[] args) {
        double[] num = {5,23,36,23,24,43,4,6,7,2};
        double result = 0;

        for (double average : num) {
            result += average;
        }

        System.out.println("Average: " + result / num.length);
    }
}
