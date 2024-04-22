package java_fundamentals.java_basics.lambdas_11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

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

public class PredicateCombinationExample {
    public static void main(String[] args) {
        // Create a list of biophysical instruments
        List<BiophysicalInstrument> instruments = new ArrayList<>();
        instruments.add(new TemperatureSensor("Temperature Sensor 1", 25.5));
        instruments.add(new TemperatureSensor("Temperature Sensor 2", 30.0));
        instruments.add(new TemperatureSensor("Pressure Sensor", 100.0));

        // Define predicates for filtering instruments
        Predicate<BiophysicalInstrument> temperaturePredicate = instrument -> instrument instanceof TemperatureSensor;
        Predicate<BiophysicalInstrument> highTemperaturePredicate = instrument -> {
            if (instrument instanceof TemperatureSensor) {
                double temperature = ((TemperatureSensor) instrument).getTemperature();
                return temperature > 28.0; // Example threshold for high temperature
            }
            return false;
        };

        // Combine predicates using logical AND
        Predicate<BiophysicalInstrument> combinedPredicate = temperaturePredicate.and(highTemperaturePredicate);

        // Filter instruments based on combined predicate
        System.out.println("High Temperature Instruments:");
        filterAndPrintInstruments(instruments, combinedPredicate);
    }

    // Method to filter and print instruments based on a predicate
    private static void filterAndPrintInstruments(List<BiophysicalInstrument> instruments, Predicate<BiophysicalInstrument> predicate) {
        for (BiophysicalInstrument instrument : instruments) {
            if (predicate.test(instrument)) {
                System.out.println(instrument.getName());
            }
        }
    }
}

