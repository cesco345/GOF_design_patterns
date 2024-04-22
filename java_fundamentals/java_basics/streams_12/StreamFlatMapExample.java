package java_fundamentals.java_basics.streams_12;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapExample {
    
    
    
        public static void main(String[] args) {
            // Generate a stream of lists containing scientific data
            Stream<List<Double>> scientificDataListsStream = Stream.of(
                    Arrays.asList(10.5, 15.2, 20.8),
                    Arrays.asList(17.3, 12.6)
            );
    
            // Flatten the stream of lists to a stream of individual data points
            Stream<Double> flattenedScientificDataStream = scientificDataListsStream.flatMap(List::stream);
    
            // Process the flattened stream (e.g., print or analyze the data)
            flattenedScientificDataStream.forEach(System.out::println);
        }
    }
    

