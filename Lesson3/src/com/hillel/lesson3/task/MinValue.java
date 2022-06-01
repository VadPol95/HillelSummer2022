package com.hillel.lesson3.task;

/**
 * Дан массив размерности N, найти наименьший элемент массива и вывести на консоль
 * (массив заполнить случайными числами из диапазона 0 .. 100)
 */


public class MinValue {

    public static void main(String[] args) {

        int[] array = new int[100];

        int i;
        for (i = 0; i < array.length - 1; i++) {
            array[i] = ((int) (Math.random() * 100));
        }

        int min = findMaxElement(new int[]{array[i]});
        System.out.println("The smallest element : " + array[min]);


    }

    public static int findMaxElement(int[] arr) {
        int temp = 0;
        int minVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                temp = i;
            }
        }
        return temp;
    }
}
