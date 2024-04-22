package arrays_1;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};

        // Print original array
        System.out.println("Original array: " + Arrays.toString(originalArray)); // [1, 2, 3, 4, 5]

        // Copy array
        int[] copiedArray = Arrays.copyOf(originalArray, originalArray.length);

        // Modify copied array
        for (int i = 0; i < copiedArray.length; i++) {
            copiedArray[i] *= 2; // Double each element
        }

        // Print copied array
        System.out.println("Modified array: " + Arrays.toString(copiedArray)); // [2, 4, 6, 8, 10]
    }
}