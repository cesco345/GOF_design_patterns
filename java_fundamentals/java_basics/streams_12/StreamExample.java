package java_fundamentals.java_basics.streams_12;

import java.util.Arrays;

public class StreamExample {

    public static void main(String[] args) {
        // Sample data
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Calculate the sum of squares of even numbers using streams
        int sumOfSquares = Arrays.stream(numbers)        // Convert array to IntStream
                .filter(n -> n % 2 == 0)                 // Filter even numbers
                .map(n -> n * n)                         // Square each number
                .sum();                                  // Calculate the sum

        // Output the result
        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}