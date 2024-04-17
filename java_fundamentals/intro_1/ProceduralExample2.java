package java_fundamentals.intro_1;

import java.util.Scanner;

public class ProceduralExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Processing
        String result = isEven(num) ? "even" : "odd";

        // Output
        System.out.println("The number " + num + " is " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}