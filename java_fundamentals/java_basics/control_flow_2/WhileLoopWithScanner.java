package java_fundamentals.java_basics.control_flow_2;

import java.util.Scanner;

public class WhileLoopWithScanner {
    public static void main(String[] args) {

        // Create a Scanner object to read user input outside of the while loop
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        // Continue to prompt the user for input until they type 'exit'
        while (!userInput.equals("exit")) {
            System.out.print("Enter a value (type 'exit' to quit): ");
            userInput = scanner.nextLine().toLowerCase();

            // Process the user input here if needed
            System.out.println("You entered: " + userInput);
        }

        System.out.println("Exiting the program...");
        scanner.close(); // Close the scanner to prevent resource leak
    }
}