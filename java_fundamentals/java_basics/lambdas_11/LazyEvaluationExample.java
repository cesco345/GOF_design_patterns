package java_fundamentals.java_basics.lambdas_11;

import java.util.function.Supplier;

// BiophysicalInstrument interface representing a biophysical instrument
interface BiophysicalInstrument {
    double measure();

    String getName();
}

public class LazyEvaluationExample {
    public static void main(String[] args) {
        // Create a temperature sensor with lazy evaluation
        Supplier<Double> temperatureSensor = () -> {
            // Simulate measuring temperature
            double temperature = Math.random() * 100; // Dummy value for demonstration
            System.out.println("Measuring temperature...");
            return temperature;
        };

        // Create a pressure sensor with lazy evaluation
        Supplier<Double> pressureSensor = () -> {
            // Simulate measuring pressure
            double pressure = Math.random() * 200; // Dummy value for demonstration
            System.out.println("Measuring pressure...");
            return pressure;
        };

        // Create a pH sensor with lazy evaluation
        Supplier<Double> pHsensor = () -> {
            // Simulate measuring pH
            double pH = Math.random() * 14; // Dummy value for demonstration
            System.out.println("Measuring pH...");
            return pH;
        };

        // Display measurements from different sensors (lazy evaluation)
        System.out.println("Temperature: " + temperatureSensor.get());
        System.out.println("Pressure: " + pressureSensor.get());
        System.out.println("pH: " + pHsensor.get());
    }
}
