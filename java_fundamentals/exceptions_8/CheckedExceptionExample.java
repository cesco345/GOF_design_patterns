package java_fundamentals.exceptions_8;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    
    
        public static void main(String[] args) {
            try {
                // Attempt to read a file that doesn't exist
                FileReader fileReader = new FileReader("nonexistentfile.txt");
            } catch (IOException e) {
                // Handle the checked exception
                System.out.println("File not found: " + e.getMessage());
            }
        }
    }

