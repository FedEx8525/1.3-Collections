# 1.3-Collections

## 📄Exercises Level 1 and 2 of Sprint1 Task 3

### S1_T3_L1_Ex1: Sprint1 Task3 Level1 Exercice1 :
Key Features
Month Class Creation:
* Defines a simple class with a name attribute.
ArrayList Manipulation:
* Creates an ArrayList containing 11 Month objects (excluding "August").
* Inserts "August" into the correct position to maintain the chronological order of the months.
* Verifies that the list remains correctly ordered after insertion.
HashSet Conversion:
* Converts the ordered ArrayList into a HashSet to demonstrate its inherent property of disallowing duplicates.
Iteration:
* Demonstrates how to traverse the collection using both a standard for loop (or enhanced for-each) and an explicit Iterator.
  
This exercise highlights the differences between ordered, index-based lists (ArrayList) and unordered, unique element sets (HashSet).

### S1_T3_L1_Ex2: Sprint1 Task3 Level1 Exercice2 :
Key Features
List Initialization: 
* Create and populate a primary List<Integer> (e.g., using ArrayList).
Reverse Insertion:
* Create a second empty List<Integer>. The goal is to copy all elements from the first list into the second one in reverse order.
ListIterator Usage:
* Utilize a ListIterator to read the elements from the first list.
* The ListIterator allows moving backward (or strategically positioning the cursor to enable backward-like reading).
* By reading elements starting from the end of the first list and adding them sequentially to the second, the elements are effectively reversed.

This project demonstrates a practical, memory-efficient way to reverse a list's contents by leveraging the advanced features of the ListIterator interface.

### S1_T3_L1_Ex3: Sprint1 Task3 Level1 Exercice3 :
This project implements a console-based quiz game that tests the user's knowledge of world capitals using Java's Collections Framework and File I/O.
Key Features
Data Persistence & Loading:
* Reads country and capital data from a source file (countries.txt).
* Stores the data efficiently in a HashMap<String, String>, where the Key is the Country and the Value is the Capital.
Gameplay Loop:
* Prompts the user for their name.
* Runs a quiz for 10 rounds.
* In each round, a country is selected randomly from the HashMap.
* The user attempts to guess the corresponding capital.
* Scores are tracked (+1 point for a correct answer).
Score Recording:
* After the 10 rounds are complete, the user's name and final score are saved to an external
  file called classificacio.txt (leaderboard/classification file).

This exercise demonstrates skills in data parsing, working with HashMaps for quick data retrieval, 
generating random selections, and writing user data to a file.

### S1_T3_L2_Ex1: Sprint1 Task3 Level2 Exercice1 :
Core Objective
To prevent duplicate Restaurante (Restaurant) objects from being added to a HashSet based on a specific business rule: 
* two restaurants are considered identical (a duplicate) only if they share the exact same nombre (name) AND puntuación (score).
Implementation Details
Restaurante Class:
* Define a class with two attributes:
  * nombre (String)
  * puntuación (int)
Enforcing Uniqueness:
* To make the HashSet respect this custom uniqueness rule:
  * the Restaurante class must correctly override two essential methods:
    * equals(Object obj): Defines when two Restaurante objects are logically identical (i.e., when both name and score match).
    * hashCode(): Must be implemented consistently with equals(). Objects that are equal (according to equals()) must return the same hash code.
      The HashSet uses the hash code to quickly determine where an object should be stored and checked for existence.
      
This project demonstrates a crucial aspect of working with Java collections: customizing the behavior of Set data structures for specific domain requirements.

### S1_T3_L2_Ex2: Sprint1 Task3 Level2 Exercice2 :
Core Objective 
To enable sorting of Restaurante objects within a Java collection (like a List or TreeSet) based on a two-level criteria:
* Primary Sort Key:
  Sort by nombre (name) in ascending alphabetical order.
* Secondary Sort Key:
  If names are identical, sort by puntuación (score) in descending numerical order (highest score first).
* Implementation DetailsThis custom sorting is achieved by implementing the Comparable interface (for natural ordering) or by creating an external Comparator.
* The required comparison logic within the compareTo() or compare() method is:
  * Step 1: Compare the names. If they differ, return the result of the name comparison.
  * Step 2: If the names are the same, compare the scores. The scores must be compared in reverse order (e.g., $B - A$ instead of $A - B$)
    to achieve descending numerical sort.
    
This exercise demonstrates a fundamental skill in Java: defining complex, multi-criteria ordering rules for custom classes.

## 💻Technologies Used
* Java JDK 21.0.6.

## 📋Requirements
* IntelliJ

## 🛠️Installation
Clone this repository : -> [git clone]https://github.com/FedEx8525/1.3-Collections

## ▶️Execution 
* Run the program in IntelliJ

## 🤝Contributions
* Review the exercises
