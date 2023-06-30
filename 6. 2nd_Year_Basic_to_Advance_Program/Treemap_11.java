import java.util.TreeMap;
import java.util.Map;

public class Treemap_11 {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "John");
        treeMap.put(1, "Emily");
        treeMap.put(2, "David");

        // Accessing elements in the TreeMap
        System.out.println("TreeMap: " + treeMap);
        System.out.println("Size: " + treeMap.size());
        System.out.println("Value at key 2: " + treeMap.get(2));
        System.out.println("Contains key 3? " + treeMap.containsKey(3));

        // Removing an element from the TreeMap
        treeMap.remove(1);
        System.out.println("TreeMap after removal: " + treeMap);

        // Iterating over the TreeMap
        System.out.println("\nIterating over the TreeMap:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
