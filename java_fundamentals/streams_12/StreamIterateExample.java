package java_fundamentals.streams_12;

import java.util.stream.Stream;

public class StreamIterateExample {

    public static void main(String[] args) {
        // Generate a stream of scientific data using Stream.iterate()
        Stream<Double> scientificDataStream = Stream.iterate(0.0, n -> n + 0.1)
                                                     .limit(20); // Limit the number of data points
                                                     

        // Process the stream (e.g., print or analyze the data)
        scientificDataStream.forEach(System.out::println);
    }
}