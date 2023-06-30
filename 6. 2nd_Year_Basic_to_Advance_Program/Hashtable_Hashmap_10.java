import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;

public class Hashtable_Hashmap_10 {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        
        // Adding key-value pairs to the Hashtable
        hashtable.put(1, "John");
        hashtable.put(2, "Emily");
        hashtable.put(3, "David");
        
        // Accessing elements in the Hashtable
        System.out.println("Hashtable: " + hashtable);
        System.out.println("Size: " + hashtable.size());
        System.out.println("Value at key 2: " + hashtable.get(2));
        System.out.println("Contains key 3? " + hashtable.containsKey(3));
        
        // Removing an element from the Hashtable
        hashtable.remove(1);
        System.out.println("Hashtable after removal: " + hashtable);
        
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adding key-value pairs to the HashMap
        hashMap.put("Apple", 10);
        hashMap.put("Banana", 5);
        hashMap.put("Orange", 8);
        
        // Accessing elements in the HashMap
        System.out.println("\nHashMap: " + hashMap);
        System.out.println("Size: " + hashMap.size());
        System.out.println("Value of 'Banana': " + hashMap.get("Banana"));
        System.out.println("Contains key 'Orange'? " + hashMap.containsKey("Orange"));
        
        // Modifying a value in the HashMap
        hashMap.put("Apple", 15);
        System.out.println("HashMap after modification: " + hashMap);
        
        // Removing an element from the HashMap
        hashMap.remove("Orange");
        System.out.println("HashMap after removal: " + hashMap);
        
        // Iterating over the HashMap
        System.out.println("\nIterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
