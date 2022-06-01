package com.hillel.lesson3.task;

/**
 * Даны переменные x и n вычислить x^n.
 */

import java.util.Scanner;

public class Root {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= x;

        }
        System.out.println("Exponentiation: " + result);


    }
}
