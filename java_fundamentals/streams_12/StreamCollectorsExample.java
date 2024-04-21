package java_fundamentals.streams_12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Neutron {
    private boolean collided;

    public Neutron(boolean collided) {
        this.collided = collided;
    }

    public boolean hasCollided() {
        return collided;
    }

    @Override
    public String toString() {
        return "Neutron: " + (collided ? "Collided" : "Did not collide");
    }
}

public class StreamCollectorsExample {

    public static void main(String[] args) {
        // Simulate the release of neutrons in a nuclear fission device
        List<Neutron> neutrons = Arrays.asList(
                new Neutron(true),
                new Neutron(false),
                new Neutron(true),
                new Neutron(true),
                new Neutron(false),
                new Neutron(true),
                new Neutron(false),
                new Neutron(true),
                new Neutron(true),
                new Neutron(false),
                new Neutron(true),
                new Neutron(false),
                new Neutron(true),
                new Neutron(true),
                new Neutron(false)
        );

        // Collect the collided and non-collided neutrons into separate lists
        Map<Boolean, List<Neutron>> neutronGroups = neutrons.stream()
                .collect(Collectors.partitioningBy(Neutron::hasCollided));

        // Print the counts of collided and non-collided neutrons
        System.out.println("Collided neutrons: " + neutronGroups.get(true).size());
        System.out.println("Did not collide neutrons: " + neutronGroups.get(false).size());
    }
}
