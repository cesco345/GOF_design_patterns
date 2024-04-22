package java_fundamentals.java_basics.lambdas_11;

// BiophysicalInstrument interface representing a biophysical instrument
interface BiophysicalInstrument {
    double measure();
}

public class BiophysicalInstrumentationApp {
    public static void main(String[] args) {
        // Create a temperature sensor using a lambda expression
        BiophysicalInstrument temperatureSensor = () -> {
            // Simulate measuring temperature
            return 25.5; // Dummy value for demonstration
        };

        // Create a pressure sensor using a lambda expression
        BiophysicalInstrument pressureSensor = () -> {
            // Simulate measuring pressure
            return 101.3; // Dummy value for demonstration
        };

        // Create a pH sensor using a lambda expression
        BiophysicalInstrument pHsensor = () -> {
            // Simulate measuring pH
            return 7.0; // Dummy value for demonstration
        };

        // Print measurements from different sensors
        System.out.println("Temperature: " + temperatureSensor.measure() + " °C");
        System.out.println("Pressure: " + pressureSensor.measure() + " atm");
        System.out.println("pH: " + pHsensor.measure());
    }
}
