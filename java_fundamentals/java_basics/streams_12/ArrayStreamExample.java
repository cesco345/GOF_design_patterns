package java_fundamentals.java_basics.streams_12;
import java.util.Arrays;

public class ArrayStreamExample {

    public static void main(String[] args) {
        // Scientific data (e.g., measurements, readings)
        double[] data = {10.5, 15.2, 20.8, 17.3, 12.6};

        // Calculate the sum of the data using a stream
        double sum = Arrays.stream(data).sum();

        // Calculate the average of the data using a stream
        double average = Arrays.stream(data).average().orElse(0);

        // Output the result
        System.out.println("Scientific Data: " + Arrays.toString(data));
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
