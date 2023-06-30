import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Mango");

        // Print the HashSet
        System.out.println("HashSet: " + set);

        // Traverse the HashSet using enhanced for loop
        System.out.println("Traversing the HashSet using enhanced for loop:");
        for (String element : set) {
            System.out.println(element);
        }

        // Traverse the HashSet using iterator
        System.out.println("Traversing the HashSet using iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
