package java_fundamentals.streams_12;

import java.util.Random;
import java.util.stream.Stream;

public class ScientificDataGenerator {

    public static void main(String[] args) {
        // Generate scientific data stream
        Stream<Double> scientificDataStream = Stream.generate(ScientificDataGenerator::generateScientificData);

        // Print the first 10 scientific data points
        scientificDataStream.limit(10).forEach(System.out::println);
    }

    // Method to generate random scientific data
    public static Double generateScientificData() {
        // Simulate generating scientific data (e.g., measurements, readings)
        Random random = new Random();
        return random.nextDouble() * 100; // Return a random double value between 0 and 100
    }
}
