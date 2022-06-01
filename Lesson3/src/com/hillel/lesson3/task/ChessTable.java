package com.hillel.lesson3.task;

/**
 * Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)
 */

public class ChessTable {
    public static void main(String[] args) {

        printChessTable();

    }

    public static void printChessTable() {
        int[][] chessTable = new int[8][8];

        for (int i = 0; i < chessTable.length; i++) {
            for (int j = 0; j < chessTable.length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" W ");
                } else {
                    System.out.print(" B ");
                }
            }
            System.out.println();
        }
    }
}
