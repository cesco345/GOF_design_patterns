package java_fundamentals.generics_9;


// Define a generic Pair class with two type parameters
class Pair<T, U> {
    private T first;
    private U second;

    // Constructor
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter methods
    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    // Setter methods
    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    // Override toString method for printing
    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }


public class MutipleTypeParametersExample {
    public static void main(String[] args) {
        // Create a Pair object with Integer and String type parameters
        Pair<Integer, String> pair = new Pair<>(10, "Hello");

        // Get and print the values from the Pair object
        System.out.println("First: " + pair.getFirst());
        System.out.println("Second: " + pair.getSecond());

        // Update the values of the Pair object
        pair.setFirst(20);
        pair.setSecond("World");

        // Print the updated Pair object
        System.out.println("Updated Pair: " + pair);
    }
}

}
