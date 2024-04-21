package java_fundamentals.streams_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ScientificDataSlicing {

    public static void main(String[] args) {
        // Sample scientific data
        List<Double> scientificData = Arrays.asList(10.5, 15.2, 20.8, 17.3, 12.6, 25.0, 18.9);

        // Select a range of data points using stream slicing
        List<Double> selectedData = scientificData.stream()
                                                  .skip(2)            // Skip the first 2 elements
                                                  .limit(3)           // Select the next 3 elements
                                                  .collect(Collectors.toList());

        // Print the selected data
        System.out.println("Selected Scientific Data:");
        selectedData.forEach(System.out::println);
    }
}