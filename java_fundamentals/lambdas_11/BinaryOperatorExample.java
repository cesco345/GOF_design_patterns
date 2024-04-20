package java_fundamentals.lambdas_11;

import java.util.ArrayList;
import java.util.List;

// BiophysicalInstrument interface representing a biophysical instrument
interface BiophysicalInstrument {
    String getName();
}

// Example class implementing the BiophysicalInstrument interface
class TemperatureSensor implements BiophysicalInstrument {
    private String name;
    private double temperature;

    public TemperatureSensor(String name, double temperature) {
        this.name = name;
        this.temperature = temperature;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getTemperature() {
        return temperature;
    }
}

public class BinaryOperatorExample {
    public static void main(String[] args) {
        // Create a list of biophysical instruments (temperature sensors)
        List<TemperatureSensor> temperatureSensors = new ArrayList<>();
        temperatureSensors.add(new TemperatureSensor("Temperature Sensor 1", 25.5));
        temperatureSensors.add(new TemperatureSensor("Temperature Sensor 2", 30.0));
        temperatureSensors.add(new TemperatureSensor("Temperature Sensor 3", 27.8));

        // Calculate the average temperature
        double averageTemperature = temperatureSensors.stream()
                .mapToDouble(TemperatureSensor::getTemperature)
                .average()
                .orElse(0.0); // Default value if the list is empty

        System.out.println("Average Temperature: " + averageTemperature);
    }
}
