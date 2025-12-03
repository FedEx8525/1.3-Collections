package s1_t3_l1_ex3;

import java.io.*;
import java.util.*;

public class Controller {
    static HashMap<String, String> countriesCapitalsMap = new HashMap<>();
    static Scanner input = new Scanner(System.in);

    public void readFile() {

        String fileName = "countries.txt";


        try {
            BufferedReader bufferRead = new BufferedReader(new FileReader(fileName));
            String line = "";

            while ((line = bufferRead.readLine()) != null) {
                String[] parts = line.split(" ", 2);
                if(parts.length == 2) {
                    String countryToFix = parts[0];
                    String capitalToFix = parts[1];

                    String country = countryToFix.replace("_", " ");
                    String capital = capitalToFix.replace("_", " ");

                    Controller.countriesCapitalsMap.put(country, capital);
                }
            }
            bufferRead.close();
        }
        catch (IOException e) {
            System.out.println("Error: the file " + fileName + " can not be found.");
        }
    }

    public String enterPlayerName() {

        String playerName;

        System.out.println("Please enter the player name: ");
        playerName = input.nextLine();
        return playerName;
    }

    public int playTheGame() {
        int playerScore = 0;
        String playerAnswer = "";
        ArrayList<String> countriesList = new ArrayList<>(countriesCapitalsMap.keySet());

        Collections.shuffle(countriesList);

        for (int i = 1; i <= 10; i++) {
            System.out.print("Guess the capital city of " + countriesList.get(i) +": ");
            playerAnswer = input.nextLine();
            playerScore += playerAnswer.equalsIgnoreCase(countriesCapitalsMap.get(countriesList.get(i))) ? 1 : 0;
        }
        return playerScore;
    }

    public void createScoreFile(String playerName, int playerScore) {

        try {
            BufferedWriter bufferWrite = new BufferedWriter(new FileWriter("classification.txt"));
            bufferWrite.write("\nGUESS THE CAPITAL OF THE RANDOM COUNTRY\n" +
                    "The player " + playerName + " has scored " + playerScore + " points.\n");
            bufferWrite.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}


