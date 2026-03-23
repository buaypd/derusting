public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable
    float negativeNumber = -20.0f;
    // Create an int with a positive value and assign it to a variable
    int positiveNumber = 20;
    // Use the modulo % operator to find the remainder when the int is divided by 3
    int num = positiveNumber % 3;
    System.out.println(num);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.
    if (positiveNumber % 2 == 0) {
      System.out.println("Even Number");
    } else {
      System.out.println("Odd Number");
    }

    // Divide the number by another number using integer division
    int division = num / 2;
    System.out.println(division);

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
