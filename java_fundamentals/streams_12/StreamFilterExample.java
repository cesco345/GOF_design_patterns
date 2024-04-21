package java_fundamentals.streams_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


    
    public class StreamFilterExample {
    
        public static void main(String[] args) {
            // Sample scientific data
            List<Double> scientificData = Arrays.asList(10.5, 15.2, 20.8, 17.3, 12.6, 25.0, 18.9);
    
            // Filter the scientific data to include only values greater than a threshold
            double threshold = 15.0;
            List<Double> filteredData = scientificData.stream()
                                                      .filter(data -> data > threshold)
                                                      .collect(Collectors.toList());
    
            // Print the filtered data
            System.out.println("Filtered Scientific Data:");
            filteredData.forEach(System.out::println);
        }
    }

