package org.example.game;

import org.example.models.Player;
import org.example.util.Helper;
import org.example.util.Record;

import java.io.IOException;

import static org.example.util.CheckResult.checkResult;
import static org.example.util.PlayGame.playGame;

public class StartGame {
    public static void start() throws IOException {
        System.out.println("Enter your name: ");
        Player pl = new Player(Helper.getString());
        String line = "";
        System.out.println("Enter number of game: ");
        int gameNumber = Helper.getNumber();


        while (!line.equalsIgnoreCase("S")) {
            System.out.println("For start enter [S] or [X] for exit");
            line = Helper.getString();
            if (line.equalsIgnoreCase("X")) System.exit(-1);
        }


        do {
            if (gameNumber == 0) {
                break;
            }
            int gameResult = playGame();

            System.out.println(checkResult(gameResult, pl));
            Record.recordFile(pl);


            System.out.println(pl);
            if (gameNumber == 1) {
                break;
            } else {
                System.out.println("Play again? [Y] / [N]");
                line = Helper.getString();
                if (line.equalsIgnoreCase("N")) {
                    System.out.println(pl);
                    break;
                }
            }
            gameNumber--;
        }
        while (0 != gameNumber);
    }
}

