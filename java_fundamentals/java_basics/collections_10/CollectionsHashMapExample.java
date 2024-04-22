package java_fundamentals.java_basics.collections_10;

import java.util.HashMap;
import java.util.Map;

public class CollectionsHashMapExample {
    
        public static void main(String[] args) {
            // Create a HashMap
            Map<String, Integer> hashMap = new HashMap<>();
    
            // Insert key-value pairs
            hashMap.put("apple", 10);
            hashMap.put("banana", 20);
            hashMap.put("orange", 15);
    
            // Retrieve values
            int value1 = hashMap.get("apple");
            int value2 = hashMap.get("banana");
            int value3 = hashMap.get("orange");
    
            // Print values
            System.out.println("Value of apple: " + value1);
            System.out.println("Value of banana: " + value2);
            System.out.println("Value of orange: " + value3);

        }
    }
    

