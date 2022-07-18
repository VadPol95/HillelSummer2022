package org.example.util;

import java.io.IOException;

public class PlayGame {
    public static int playGame() throws IOException {
        int [][] board = Board.giveBoard();
        int computerHand = Hand.giveComputerHand();
        int playerHand = Hand.giveHand();
        System.out.println("Player throw :" + Hand.givePlayerHand(playerHand) + ", Computer throw :" + Hand.givePcHand(computerHand));
        return board[playerHand][computerHand];
    }
}
