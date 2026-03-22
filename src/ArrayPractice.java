public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] letters = new String[4];
    // Set the value of the array at each index 
    letters[0] = "a";
    letters[1] = "b";
    letters[2] = "c";
    letters[3] = "d";
    // to be a different String
    // It's OK to do this one-by-one

    // Get the value of the array at index 2
    System.out.println(letters[2]);

    // Get the length of the array
    System.out.println(letters.length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i = 0; i < letters.length; i++) {
      System.out.println(letters[i]);
    }

    // Iterate over the array using a for-each loop and print out each item

      for (String letter : letters) {
        System.out.println(letter);
        
      }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
