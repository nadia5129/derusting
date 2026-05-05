import java.util.ArrayList;
import java.util.List;

public class ListPractice {

  // list use add, remove , size, get, set, contains


  public static void main(String[] args) {
    // Create an empty ArrayList of Strings and assign it to a variable of type List
   List<String> vtList = new ArrayList<>();


    // Add 3 elements to the list (OK to do one-by-one)
    vtList.add(0, "string one");
    vtList.add(1, "string two");
    vtList.add(2,"string three");


    // Print the element at index 1
    System.out.println(vtList.get(1));

    // Replace the element at index 1 with a new value
    // (Do not insert a new value. The length of the list should not change)
    vtList.set(1, "new value");
    // Insert a new element at index 0 (the length of the list will change)

    // Check whether the list contains a certain string


    // Iterate over the list using a traditional for-loop.
    // Print each index and value on a separate line

    // Sort the list using the Collections library

    // Iterate over the list using a for-each loop
    // Print each value on a second line

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