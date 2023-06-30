import java.util.ArrayList;

public class ArrayList_9 {
    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements in the ArrayList
        System.out.println("Fruits: " + fruits);

        // Get the size of the ArrayList
        System.out.println("Size: " + fruits.size());

        // Check if the ArrayList is empty
        System.out.println("Is empty? " + fruits.isEmpty());

        // Access elements by index
        System.out.println("Element at index 1: " + fruits.get(1));

        // Update an element
        fruits.set(2, "Mango");
        System.out.println("Updated fruits: " + fruits);

        // Remove an element by index
        fruits.remove(0);
        System.out.println("Fruits after removal: " + fruits);

        // Check if an element exists
        System.out.println("Contains 'Banana'? " + fruits.contains("Banana"));

        // Iterate over the ArrayList using a loop
        System.out.println("Iterating over the fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear the ArrayList
        fruits.clear();
        System.out.println("Cleared fruits: " + fruits);
    }
}
