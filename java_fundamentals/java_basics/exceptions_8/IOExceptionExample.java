package java_fundamentals.java_basics.exceptions_8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class IOExceptionExample {
    
        public static void main(String[] args) {
            try {
                // Attempt to read a file that doesn't exist
                BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
                String line = reader.readLine(); // This line will throw an IOException
                System.out.println("Line read from file: " + line);
                reader.close();
            } catch (IOException e) {
                // Catch and handle the IOException
                System.out.println("IOException caught: " + e.getMessage());
            }
        }
    }
    

