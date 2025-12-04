package s1_t3_l2_ex1;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class S1_T3_L2_Ex1 {

    public static void main(String[] args) {

        HashSet<Restaurant> restaurantsList = new HashSet<Restaurant>();
        Scanner input = new Scanner((System.in));
        int selectMenu = 0;
        String answer = "";

        System.out.println("\n--- Start program ---\n");
        do{
            System.out.println("Main Menu :\n" +
                               "1. Add a new restaurant\n" +
                               "2. Show restaurant list\n" +
                               "0. Exit");

            selectMenu = readInt("Pleas enter the number next to the option you " +
                                 "want to choose:", input);

            switch (selectMenu) {
                case 1 :
                    answer = addNewRestaurant(restaurantsList, input);
                    break;
                case 2 :
                    answer = showRestaurantsList(restaurantsList);
                    break;
                case 0 :
                    answer = "Quit the program";
                    break;
                default :
                    answer = "Invalid number";
            }
            System.out.println(answer);
        } while(selectMenu != 0);




    }

    public static int readInt(String message, Scanner input) {
        int dataEnter = 0;

        while (true) {
            System.out.println(message);
            try {
                dataEnter = input.nextInt();
                input.nextLine();
                return dataEnter;
            } catch (InputMismatchException e) {
                System.out.println("Format error! Enter a valid integer number.");
                input.nextLine();
            }
        }
    }

    public static String readString(String message, Scanner input) {
        String dataEnter = "";

        while(true) {
            System.out.println(message);

            try {
                dataEnter = input.nextLine();

                if(dataEnter.trim().isEmpty()) {
                    throw new InvalidEnterException("Format error! The string can not be empty or just with space.\n");
                }
                return dataEnter;
            }
            catch (InvalidEnterException e) {
                System.out.println("Exception catch: " + e.getMessage());
            }
        }
    }

    public static String addNewRestaurant(HashSet<Restaurant> restaurantsList, Scanner input) {
        String restaurantName = "";
        int restaurantRating = 0;
        String answer = "";

        restaurantName = readString("\nEnter the restaurant name:", input);
        restaurantRating = readInt("\nEnter the restaurant rating: ", input);
        Restaurant newRestaurant = new Restaurant(restaurantName, restaurantRating);

        if (restaurantsList.add(newRestaurant)) {
            answer = "The restaurant " + restaurantName + " was successfully created and added to the list.";
        }
        else {
            answer = "Error: duplicate detected! The restaurant " + restaurantName + " with rating " +
                     restaurantRating + " already exist and was NOT added to the list.";
        }

        return answer;
    }

    public static String showRestaurantsList(HashSet<Restaurant> restaurantsList) {
        String answer = "";

        for(Restaurant restaurant : restaurantsList) {
            answer += restaurant.toString() + "\n";
        }

        return answer;
    }
}
