package s1_t3_l1_ex2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class S1_T3_L1_Ex2 {

    public static void main(String[] args) {

        System.out.println("\n--- Start program ---\n");

        int i = 0;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("- Creating and filling a List with integer numbers -\n");

        List<Integer> numbersList = new ArrayList<Integer>();
        List<Integer> numbersListInvert = new ArrayList<Integer>();

        while(i < numbers.length) {
            numbersList.add(numbers[i]);
            i++;
        }

        System.out.println("Printing numbersList");
        for(int number : numbersList) {
            System.out.print(number);
        }

        ListIterator<Integer> itList = numbersList.listIterator(numbersList.size());
        while(itList.hasPrevious()) {
            numbersListInvert.add(itList.previous());
        }

        System.out.println("\nPrinting numbersListInvert");
        for(int number : numbersListInvert) {
            System.out.println(number);
        }

        System.out.println("\n--- End program ---\n");
    }
}
