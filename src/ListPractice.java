import java.util.*;
public class ListPractice {


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
    ArrayList<String> letters = new ArrayList<>();

    // Add 3 elements to the list (OK to do one-by-one)
    letters.add("a");
    letters.add("b");
    letters.add("c");

    // Print the element at index 1
    System.out.println(letters.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    letters.set(1, "z");

    // Insert a new element at index 0 (the length of the list will change)
    letters.add(0, "d");

    // Check whether the list contains a certain string
    if (letters.contains("a")) {
      System.out.println("This letter is in the list.");
    }
    else {
      System.out.println("this letter is NOT in the list.");
    }

    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line
    for (int i = 0; i < letters.size(); i++) {
      String letter = letters.get(i);
      System.out.println(letter);
    }

    // Sort the list using the Collections library
    Collections.sort(letters);

    // Iterate over the list using a for-each loop
    // Print each value on a second line
    for (String letter : letters) {
      System.out.println(letter);
    }

    /*
     * Usage tip!
     * 
     * Use a traditional for-loop when you need to use the index or you need to iterate in an
     * unconventional order (e.g. backwards)
     * 
     * Otherwise, if you're iterating the in the conventional order and don't need the
     * index values a for-each loop is cleaner.
     */
  }
}