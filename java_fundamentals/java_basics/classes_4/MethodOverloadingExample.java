package java_fundamentals.java_basics.classes_4;

public class MethodOverloadingExample {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();

        // Call the add methods with different parameter lists
        System.out.println("Sum of 2 and 3: " + example.add(2, 3));
        System.out.println("Sum of 2.5 and 3.7: " + example.add(2.5, 3.7));
        System.out.println("Concatenation of 'Hello' and 'World': " + example.add("Hello", "World"));
        System.out.println("Sum of 2, 3, and 4: " + example.add(2, 3, 4));
    }
}
