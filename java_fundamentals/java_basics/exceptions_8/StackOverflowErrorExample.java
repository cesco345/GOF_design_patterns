package java_fundamentals.java_basics.exceptions_8;

public class StackOverflowErrorExample {
   
        public static void main(String[] args) {
            try {
                // Call a recursive method that causes stack overflow
                recursiveMethod(0);
            } catch (StackOverflowError e) {
                // Catch and handle the StackOverflowError
                System.out.println("StackOverflowError caught: " + e.getMessage());
            }
        }
    
        // Recursive method that causes stack overflow
        public static void recursiveMethod(int i) {
            System.out.println("Method call: " + i);
            recursiveMethod(i + 1); // Recursive call without base case
        }
    }

