package java_fundamentals.java_basics.intro_1;

import java.util.Scanner;

public class ProceduralPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Processing
        boolean isPrime = checkPrime(num);

        // Output
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}