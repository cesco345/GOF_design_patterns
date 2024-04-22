package java_fundamentals.java_basics.streams_12;

import java.util.stream.Stream;

public class StreamMapExample {

    public static void main(String[] args) {
        // Generate a stream of raw scientific data
        Stream<Double> rawScientificDataStream = Stream.of(10.5, 15.2, 20.8, 17.3, 12.6);

        // Map the raw data to perform some scientific transformation
        Stream<Double> transformedScientificDataStream = rawScientificDataStream.map(StreamMapExample::performTransformation);

        // Process the transformed stream (e.g., print or analyze the data)
        transformedScientificDataStream.forEach(System.out::println);
    }

    // Method to perform a scientific transformation on the data
    public static Double performTransformation(Double data) {
        // Example transformation: square the data
        return Math.pow(data, 2);
    }
}