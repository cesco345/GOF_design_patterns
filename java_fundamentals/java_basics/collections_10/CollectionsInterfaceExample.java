package java_fundamentals.java_basics.collections_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsInterfaceExample {
    
        public static void main(String[] args) {
            // Create a list of integers
            List<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(2);
            numbers.add(7);
            numbers.add(1);
    
            // Sort the list in natural order
            Collections.sort(numbers);
            System.out.println("Sorted list: " + numbers);
    
            // Shuffle the list
            Collections.shuffle(numbers);
            System.out.println("Shuffled list: " + numbers);
    
            // Reverse the list
            Collections.reverse(numbers);
            System.out.println("Reversed list: " + numbers);
    
            // Find the minimum and maximum elements in the list
            System.out.println("Minimum element: " + Collections.min(numbers));
            System.out.println("Maximum element: " + Collections.max(numbers));
    
            // Fill the list with a specific value
            Collections.fill(numbers, 10);
            System.out.println("Filled list: " + numbers);
        }
    }

