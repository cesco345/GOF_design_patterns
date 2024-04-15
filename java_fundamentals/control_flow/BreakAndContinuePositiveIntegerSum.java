package java_fundamentals.control_flow;

import java.util.Scanner;

public class BreakAndContinuePositiveIntegerSum {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        // Continue reading numbers until a negative number is entered
        while (true) {
            // Prompt the user to enter a positive integer
            System.out.print("Enter a positive integer (or a negative number to exit): ");
            int number = scanner.nextInt();

            // Check if the number is negative
            if (number < 0) {
                System.out.println("Negative number entered. Exiting the loop.");
                break; // Exit the loop when a negative number is entered
            }

            sum += number; // Add the positive number to the sum
        }
        // Display the sum of positive integers entered
        System.out.println("Sum of positive integers entered: " + sum);
        scanner.close();
    }
}
