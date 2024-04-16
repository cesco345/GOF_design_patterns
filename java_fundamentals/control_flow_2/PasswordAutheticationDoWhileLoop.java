package java_fundamentals.control_flow_2;
import java.util.Scanner;

public class PasswordAutheticationDoWhileLoop {

    // This program demonstrates a simple password authentication mechanism using a do-while loop.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "12345"; // The correct password
        
        String inputPassword;
        boolean isAuthenticated = false;

        // Continue to prompt the user for the password until it is correct
        do {
            System.out.print("Enter the password: ");
            inputPassword = scanner.nextLine();

            if (inputPassword.equals(password)) {
                System.out.println("Authentication successful!");
                isAuthenticated = true;
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } while (!isAuthenticated);

        scanner.close();
    }
}


