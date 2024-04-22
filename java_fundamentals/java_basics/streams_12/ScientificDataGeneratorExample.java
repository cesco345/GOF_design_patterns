package java_fundamentals.java_basics.streams_12;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class ScientificDataPoint {
    private double value;

    public ScientificDataPoint(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}

public class ScientificDataGeneratorExample {

    public static void main(String[] args) {
        // Generate some sample scientific data points
        List<ScientificDataPoint> scientificData = generateScientificData(10);
        
        // Print the generated data points
        for (ScientificDataPoint dataPoint : scientificData) {
            System.out.println(dataPoint.getValue());
        }
    }

    public static List<ScientificDataPoint> generateScientificData(int count) {
        List<ScientificDataPoint> dataPoints = new ArrayList<>();
        Random random = new Random();
        
        for (int i = 0; i < count; i++) {
            double value = random.nextDouble() * 100; // Example value range [0, 100)
            dataPoints.add(new ScientificDataPoint(value));
        }
        
        return dataPoints;
    }
}