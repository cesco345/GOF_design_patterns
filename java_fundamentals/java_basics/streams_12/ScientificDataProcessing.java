package java_fundamentals.java_basics.streams_12;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

// Class representing a complex scientific data point
class InstrumentData {
    private String label;

    public InstrumentData(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return "Label: " + label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstrumentData that = (InstrumentData) o;
        return Objects.equals(label, that.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }
}

public class ScientificDataProcessing {

    public static void main(String[] args) {
        // Sample complex data produced by an instrument
        List<InstrumentData> instrumentData = Arrays.asList(
                new InstrumentData("A"),
                new InstrumentData("B"),
                new InstrumentData("C"),
                new InstrumentData("B"),  // Duplicate
                new InstrumentData("A")   // Duplicate
        );

        // Exclude duplicates from the instrument data
        List<InstrumentData> uniqueData = instrumentData.stream()
                                                        .distinct()  // Filter out duplicates
                                                        .collect(Collectors.toList());

        // Print the unique data
        System.out.println("Unique Instrument Data:");
        uniqueData.forEach(System.out::println);
    }
}