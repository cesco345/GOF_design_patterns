package java_fundamentals.generics_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    
    // Define a class representing a generic Box
    class Box<T extends Comparable<T>> implements Comparable<Box<T>> {
        private T value;
    
        // Constructor
        public Box(T value) {
            this.value = value;
        }
    
        // Getter method
        public T getValue() {
            return value;
        }
    
        // Implement compareTo method from Comparable interface
        @Override
        public int compareTo(Box<T> otherBox) {
            return this.value.compareTo(otherBox.getValue());
        }
    
        // Override toString method for printing
        @Override
        public String toString() {
            return "Box{" +
                    "value=" + value +
                    '}';
        }
    }
    
    public class GenericsComparableExample {
        public static void main(String[] args) {
            // Create a list of Box objects with Integer values
            List<Box<Integer>> boxList = new ArrayList<>();
            boxList.add(new Box<>(10));
            boxList.add(new Box<>(5));
            boxList.add(new Box<>(15));
    
            // Print the original list
            System.out.println("Original list:");
            System.out.println(boxList);
    
            // Sort the list using Collections.sort() method
            Collections.sort(boxList);
    
            // Print the sorted list
            System.out.println("Sorted list:");
            System.out.println(boxList);
        }
    }
    

