package s1_t3_l1_ex3;

import java.io.*;
import java.util.*;

public class S1_T3_L1_Ex3 {

    public static void main(String[] args) {

        String playerName = "";
        int playerScore = 0;

        Controller gameController = new Controller();
        gameController.readFile();
        playerName =  gameController.enterPlayerName();
        playerScore = gameController.playTheGame();
        gameController.createScoreFile(playerName, playerScore);
    }
}
