package java_fundamentals.java_basics.intro_1;

import java.util.Scanner;

public class ProceduralFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();

        // Output
        System.out.println("Fibonacci sequence up to " + n + " terms:");

        // Display Fibonacci sequence
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to calculate Fibonacci number at given index
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int fib = 0;
        int prev = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            fib = prev + current;
            prev = current;
            current = fib;
        }
        return fib;
    }
}