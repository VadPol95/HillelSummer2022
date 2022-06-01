package com.hillel.lesson3.task;

/**
 * Вывести 10 первых чисел последовательности 0, -5,-10,-15..
 */

public class Subsequence {
    public static void main(String[] args) {

        for (int i = 0; i >= -45 ; --i) {
            if(i % 5 == 0){
                System.out.println(i);
            }

        }
    }
}
