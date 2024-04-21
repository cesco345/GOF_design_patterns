package java_fundamentals.streams_12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Class representing a complex scientific data point
class ScientificDataPoint {
    private double value;
    private String label;

    public ScientificDataPoint(double value, String label) {
        this.value = value;
        this.label = label;
    }

    public double getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "Label: " + label + ", Value: " + value;
    }
}

public class ScientificDataSorting {

    public static void main(String[] args) {
        // Sample complex scientific data
        List<ScientificDataPoint> data = Arrays.asList(
                new ScientificDataPoint(10.5, "A"),
                new ScientificDataPoint(15.2, "B"),
                new ScientificDataPoint(20.8, "C"),
                new ScientificDataPoint(17.3, "D"),
                new ScientificDataPoint(12.6, "E")
        );

        // Sort the data points by value in ascending order
        data.stream()
            .sorted(Comparator.comparingDouble(ScientificDataPoint::getValue))
            .forEach(System.out::println);
    }
}
