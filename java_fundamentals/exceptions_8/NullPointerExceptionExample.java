package java_fundamentals.exceptions_8;

public class NullPointerExceptionExample {
    
        public static void main(String[] args) {
            String str = null;
            try {
                // Attempt to access a method or field of a null reference
                int length = str.length(); // This line will throw a NullPointerException
                System.out.println("Length of string: " + length);
            } catch (NullPointerException e) {
                // Catch and handle the NullPointerException
                System.out.println("NullPointerException caught: " + e.getMessage());
            }
        }
    }

