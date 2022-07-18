package org.example.util;

import org.example.models.Player;

public class CheckResult {
    public static String checkResult(int gameResult, Player pl){
        String line = null;
        if( gameResult == 0){
            line = "Ties";
            pl.setTies(pl.getTies() + 1);
        }if(gameResult == 1){
            line = "Player " + pl.getName() +" Win.";
            pl.setWin(pl.getWin() + 1);
        }if (gameResult == 2){
            line ="Computer Win";
            pl.setLost(pl.getLost() + 1);


        }
        return line;
    }
}
