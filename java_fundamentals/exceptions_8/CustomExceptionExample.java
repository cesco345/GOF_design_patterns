package java_fundamentals.exceptions_8;

public class CustomExceptionExample {
// Custom exception class
class MyCustomException extends Exception {
    // Constructor with a message
    public MyCustomException(String message) {
        super(message);
    }
}

// Example usage of the custom exception

    public static void main(String[] args) {
        try {
            // Simulate a condition that triggers the custom exception
            int age = -1;
            if (age < 0) {
                // Throw the custom exception with a specific message
                throw new MyCustomException("Age cannot be negative");
            }
        } catch (MyCustomException e) {
            // Catch and handle the custom exception
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}


