package java_fundamentals.java_basics.streams_12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Class representing a complex scientific data point
class ScientificDataPoint {
    public double value;
    public boolean isValid;

    public ScientificDataPoint(double value, boolean isValid) {
        this.value = value;
        this.isValid = isValid;
    }

    public double getValue() {
        return value;
    }

    public boolean isValid() {
        return isValid;
    }

    @Override
    public String toString() {
        return "Value: " + value + ", Valid: " + isValid;
    }
}

public class ScientificDataValidationExample {

    public static void main(String[] args) {
        // Sample complex scientific data
        List<ScientificDataPoint> scientificData = Arrays.asList(
                new ScientificDataPoint(10.5, true),
                new ScientificDataPoint(-5.0, false),   // Invalid data
                new ScientificDataPoint(20.8, true),
                new ScientificDataPoint(17.3, true),
                new ScientificDataPoint(12.6, true)
        );

        // Process the scientific data, excluding invalid data points
        List<Double> validData = scientificData.stream()
                                               .filter(ScientificDataPoint::isValid)  // Filter out invalid data points
                                               .peek(System.out::println)              // Peek at each valid data point
                                               .map(ScientificDataPoint::getValue)     // Map to value
                                               .collect(Collectors.toList());

        // Print the valid data points
        System.out.println("Valid Scientific Data:");
        validData.forEach(System.out::println);
    }
}
