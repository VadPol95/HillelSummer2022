package com.hillel.lesson3.task;

/**
 * Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку,
 * разделяя запятой.
 */


public class OddNumber {
    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2 * i + 1;
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
