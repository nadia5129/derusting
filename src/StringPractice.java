import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String country = "russia";

    // Find the length of the string
    System.out.println(country.length());

    // Concatenate (add) two strings together and reassign the result
    String mood = "Super" + "sad";

    // Find the value of the character at index 3
    System.out.println(mood.charAt(3));

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    System.out.println(mood.contains("abc"));

    // Iterate over the characters of the string, printing each one on a separate line
    for(int i = 0; i < mood.length(); i++){
      System.out.println(mood.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> moods = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    moods.add("silly");
    moods.add("happy");
    moods.add("mad");


    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
  System.out.println(String.join(",", moods));

    // Check whether two strings are equal
    String mood1 = "happy";
    String mood2 = "happy";

    System.out.println(mood1.equals(mood2));

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
