package com.hillel.lesson3.task;

/**
 * Поменять наибольший и наименьший элементы массива местами.
 * Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.
 */

import java.util.Scanner;

public class SwapMinMax {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the size of array: ");
        int n = scanner.nextInt();

        int[] arrayNumber = new int[n];

        System.out.println("Enter the elements to be entered : ");
        for (int i = 0; i < n; i++) {
            arrayNumber[i] = scanner.nextInt();
        }

        int maxElementPosition = findMaxElement(arrayNumber, n);
        System.out.println("The biggest element : " + arrayNumber[maxElementPosition]);

        int minElementPosition = findMinElement(arrayNumber, n);
        System.out.println("The smallest element : " + arrayNumber[minElementPosition]);

        swapMaxMinElement(arrayNumber, maxElementPosition, minElementPosition);

        System.out.println("The array after swap is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arrayNumber[i] + " ");
        }
    }

    public static int findMaxElement(int[] arr, int n) {
        int temp = 0;
        int maxVal = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
                temp = i;
            }
        }
        return temp;
    }

    public static int findMinElement(int[] arr, int n) {
        int temp = 0;
        int minVal = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
                temp = i;
            }
        }
        return temp;
    }

    public static void swapMaxMinElement(int[] arr, int maxElementPosition, int minElementPosition) {

        int temp;
        temp = arr[maxElementPosition];
        arr[maxElementPosition] = arr[minElementPosition];
        arr[minElementPosition] = temp;
    }
}
