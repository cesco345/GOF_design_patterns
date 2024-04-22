package java_fundamentals.java_basics.lambdas_11;


import java.util.function.Consumer;

// BiophysicalInstrument interface representing a biophysical instrument
interface BiophysicalInstrument {
    double measure();
}

public class LambdaConsumerInterfaceExample {
    public static void main(String[] args) {
        // Create a temperature sensor
        BiophysicalInstrument temperatureSensor = () -> {
            // Simulate measuring temperature
            return 25.5; // Dummy value for demonstration
        };

        // Create a pressure sensor
        BiophysicalInstrument pressureSensor = () -> {
            // Simulate measuring pressure
            return 101.3; // Dummy value for demonstration
        };

        // Create a pH sensor
        BiophysicalInstrument pHsensor = () -> {
            // Simulate measuring pH
            return 7.0; // Dummy value for demonstration
        };

        // Define a consumer for displaying measurements
        Consumer<Double> displayMeasurement = measurement -> System.out.println("Measurement: " + measurement);

        // Display measurements from different sensors
        displayMeasurement.accept(temperatureSensor.measure());
        displayMeasurement.accept(pressureSensor.measure());
        displayMeasurement.accept(pHsensor.measure());
    }
}
