package java_fundamentals.java_basics.control_flow_2;

import java.util.Scanner;

public class DoWhileLoopWithScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.print("Enter a value (type 'exit' to quit): ");
            userInput = scanner.nextLine().toLowerCase();

            // Process the user input here if needed
            System.out.println("You entered: " + userInput);
        } while (!userInput.equals("exit"));

        System.out.println("Exiting the program...");
        scanner.close(); // Close the scanner to prevent resource leak
    }
}
