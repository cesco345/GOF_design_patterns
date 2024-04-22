package java_fundamentals.java_basics.streams_12;
import java.util.Arrays;
import java.util.List;

class ScientificDataPoint {
    private double value;

    public ScientificDataPoint(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

public class StreamReducersExample {

    public static void main(String[] args) {
        // Sample complex scientific data
        List<ScientificDataPoint> scientificData = Arrays.asList(
                new ScientificDataPoint(10.5),
                new ScientificDataPoint(-5.0),
                new ScientificDataPoint(20.8),
                new ScientificDataPoint(17.3),
                new ScientificDataPoint(12.6)
        );

        // Calculate sum of all values
        double sum = scientificData.stream()
                                   .mapToDouble(ScientificDataPoint::getValue)
                                   .sum();
        System.out.println("Sum of all values: " + sum);

        // Calculate average of all values
        double average = scientificData.stream()
                                       .mapToDouble(ScientificDataPoint::getValue)
                                       .average()
                                       .orElse(0.0); // Default value if no elements present
        System.out.println("Average of all values: " + average);

        // Find maximum value
        double max = scientificData.stream()
                                   .mapToDouble(ScientificDataPoint::getValue)
                                   .max()
                                   .orElse(0.0); // Default value if no elements present
        System.out.println("Maximum value: " + max);

        // Find minimum value
        double min = scientificData.stream()
                                   .mapToDouble(ScientificDataPoint::getValue)
                                   .min()
                                   .orElse(0.0); // Default value if no elements present
        System.out.println("Minimum value: " + min);
    }
}

