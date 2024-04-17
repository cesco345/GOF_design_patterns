package java_fundamentals.intro_1;

import java.util.Scanner;

public class ProceduralFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Processing
        int factorial = calculateFactorial(num);

        // Output
        System.out.println("The factorial of " + num + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }

    // Method to calculate the factorial of a number
    public static int calculateFactorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
