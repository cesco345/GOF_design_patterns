package java_fundamentals.java_basics.collections_10;

import java.util.ArrayList;
import java.util.List;

public class CollectionsListInterfaceAvailableMethodsExample {

        public static void main(String[] args) {
            // Create a list
            List<String> myList = new ArrayList<>();
    
            // Add elements to the list
            myList.add("Apple");
            myList.add("Banana");
            myList.add("Orange");
            myList.add("Grapes");
    
            // Print the list
            System.out.println("Original List: " + myList);
    
            // Get the size of the list
            int size = myList.size();
            System.out.println("Size of List: " + size);
    
            // Check if the list contains an element
            boolean containsBanana = myList.contains("Banana");
            System.out.println("List contains 'Banana': " + containsBanana);
    
            // Get an element at a specific index
            String elementAtIndex2 = myList.get(2);
            System.out.println("Element at index 2: " + elementAtIndex2);
    
            // Set an element at a specific index
            myList.set(1, "Mango");
            System.out.println("List after setting 'Mango' at index 1: " + myList);
    
            // Remove an element at a specific index
            String removedElement = myList.remove(3);
            System.out.println("Removed element at index 3: " + removedElement);
            System.out.println("List after removing element: " + myList);
    
            // Remove the first occurrence of a specific element
            boolean removed = myList.remove("Apple");
            System.out.println("Removed 'Apple': " + removed);
            System.out.println("List after removing 'Apple': " + myList);
    
            // Clear the list
            myList.clear();
            System.out.println("List after clearing: " + myList);
    
            // Check if the list is empty
            boolean isEmpty = myList.isEmpty();
            System.out.println("Is list empty? " + isEmpty);
        }
    }

