package s1_t3_l1_ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class s1_t3_l1_ex1 {

    public static void main(String[] args) {

        Month newMonth = null;


        System.out.println("\n--- Star program ---\n");

        ArrayList<Month> months = new ArrayList<>();
        String[] names = {"January", "February", "March", "April", "May", "June", "July",
                            "August", "September", "October", "November", "December"};

        System.out.println("- Creating month objects and adding them to the months arraylist -\n");

        int i = 0;
        while (i < names.length) {
            if (!names[i].equals("August")) {
                newMonth = new Month(names[i]);
                months.add(newMonth);
                System.out.println(newMonth.toString());
            }

            i++;
        }

        System.out.println("\n- Adding de August month -\n");

        newMonth = new Month(names[7]);
        months.add(7, newMonth);
        System.out.println(newMonth.toString());

        System.out.println("\n- Printing the months list to show that august being added and the list " +
                           " still staying in the right order -\n");

        for(Month month : months) {
            System.out.println(month);
        }

        System.out.println("\n- Creating and printing an HashSet -\n");

        Set<Month> monthsSet = new HashSet<Month>(months);

        System.out.println("- Demonstrating that a hashSet does not allow duplicate elements -\n");

        System.out.println("The monthSet contains " + monthsSet.size() + " elements.\n");

        monthsSet.add(new Month("January"));
        monthsSet.add(new Month("May"));
        monthsSet.add(new Month("September"));

        System.out.println("The monthSet still contains " + monthsSet.size() + " elements.\n");

        System.out.println("- Printing monthSet with a foreach -\n");

        for(Month month : monthsSet) {
            System.out.println(month);
        }


        System.out.println("\n- Printing monthSet with a Iterator -\n");

        Iterator<Month> iterator = monthsSet.iterator();
        while (iterator.hasNext()) {
            Month month = iterator.next();
            System.out.println(month);
        }

        System.out.println("\n--- End program ---\n");

    }
}
