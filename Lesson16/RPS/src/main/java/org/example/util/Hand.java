package org.example.util;

import java.io.IOException;

public class Hand {
    public static int giveHand() throws IOException {
        System.out.println("Rock, Paper or Scissors");
        String hand = Helper.getString();
        int handNum;
        switch (hand){
            case "Rock":
                handNum = 0;
                break;

            case "Scissors":
                handNum = 1;
                break;

            case "Paper":
                handNum = 2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + hand);
        }
        return handNum;
    }
    public static String givePlayerHand(int pcHand) throws IOException {

        String hand;
        switch (pcHand){
            case 0:
                hand = "Rock";
                break;

            case 1:
                hand = "Scissors";
                break;

            case 2:
                hand = "Paper";
                break;
            default:
                throw new IllegalStateException(" Invalid enter, try again");

        }
        return hand;
    }

    public static String givePcHand(int pcHand) throws IOException {
        String hand;
        switch (pcHand){
            case 0:
                hand = "Rock";
                break;

            case 1:
                hand = "Scissors";
                break;

            case 2:
                hand = "Paper";
                break;
            default:
                throw new IllegalStateException("Unexpected value: ");
        }
        return hand;
    }

    public static int giveComputerHand(){
        return Helper.getRandomNumber(0,3);
    }
}
