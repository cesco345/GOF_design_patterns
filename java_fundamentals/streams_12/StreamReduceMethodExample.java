package java_fundamentals.streams_12;

import java.util.Arrays;
import java.util.List;

class Neutron {
    private boolean collided;

    public Neutron(boolean collided) {
        this.collided = collided;
    }

    public boolean hasCollided() {
        return collided;
    }
}

public class StreamReduceMethodExample {

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
        
        

        // Calculate the number of neutrons that collided
        int collidedNeutrons = neutrons.stream()
                                       .mapToInt(neutron -> neutron.hasCollided() ? 1 : 0)
                                       .reduce(0, Integer::sum);

        System.out.println("Number of collided neutrons: " + collidedNeutrons);
    }
}
