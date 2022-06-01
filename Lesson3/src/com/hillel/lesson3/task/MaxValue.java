package com.hillel.lesson3.task;

/**
 * В массиве из задания 9. найти наибольший элемент
 */



public class MaxValue {

    public static void main(String[] args) {

        int[] array = new int[100];

        int i;
        for (i = 0; i < array.length - 1; i++) {
            array[i] = ((int) (Math.random() * 100));
        }

        int max = findMaxElement(new int[]{array[i]});
        System.out.println("The biggest element : " + array[max]);


    }

    public static int findMaxElement(int[] arr) {
        int temp = 0;
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                temp = i;
            }
        }
        return temp;
    }
}
