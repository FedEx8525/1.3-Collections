package s1_t3_l2_ex2;

import java.util.*;

public class S1_T3_L2_Ex2 {

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
                    "3. Show restaurant list sorted by name and rating\n" +
                    "0. Exit");

            selectMenu = readInt("Please enter the number next to the option you " +
                    "want to choose:", input);

            switch (selectMenu) {
                case 1 :
                    answer = addNewRestaurant(restaurantsList, input);
                    break;
                case 2 :
                    answer = showRestaurantsList(restaurantsList);
                    break;
                case 3 :
                    answer = restaurantListByNameAndRating(restaurantsList);
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

        if (restaurantsList.isEmpty()) {
            return "The restaurants list is empty.\n";
        }
        else {
            System.out.println("--- Restaurant list ---");
            for(Restaurant restaurant : restaurantsList) {
                System.out.println(restaurant.toString());
            }
        }
       return "--- end list --- ";
    }

    public static String restaurantListByNameAndRating(HashSet<Restaurant> restaurantsList) {

        if (restaurantsList.isEmpty()) {
            return "The restaurants list is empty.\n" +
                    "You cannot sort an empty list.\n";
        }

        List<Restaurant> sortedList = new ArrayList<>(restaurantsList);

        Collections.sort(sortedList, new Comparator<Restaurant>() {
            @Override
            public int compare(Restaurant r1, Restaurant r2) {
               int answer = r1.getName().compareTo(r2.getName());
               if(answer == 0) {
                   answer = r2.getRating() - r1.getRating();
               }
               return answer;
            }
        });
        System.out.println("--- Restaurant list sorted by Name and descending Rating ---");
        for(Restaurant restaurant : sortedList) {
            System.out.println(restaurant.toString());
        }
        return "--- end sorted list ---";
    }

}
