import java.util.*;
public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "wordle";

    // Find the length of the string
    System.out.println(word.length());

    // Concatenate (add) two strings together and reassign the result
    String together = "One" + "Two"; 

    // Find the value of the character at index 3
    System.out.println(word.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(word.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < word.length(); i++) {
      System.out.println(word.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> words = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    words.add("Grass");
    words.add("Tree");
    words.add("Bush");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String.join(", ", words);
    System.out.println(String.join(", ", words));

    // Check whether two strings are equal
    String a = "Cat";
    String b = "Dog";
    System.out.println(a.equals(b));
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
