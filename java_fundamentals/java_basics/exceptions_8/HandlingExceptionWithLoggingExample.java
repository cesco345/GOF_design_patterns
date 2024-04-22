package java_fundamentals.java_basics.exceptions_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.*;

public class HandlingExceptionWithLoggingExample {

        private static final Logger logger = Logger.getLogger(Main.class.getName());
    
        public static void main(String[] args) {
            try {
                // Attempt to read a file that doesn't exist
                BufferedReader reader = new BufferedReader(new FileReader("nonexistentfile.txt"));
                String line = reader.readLine(); // This line will throw an IOException
                System.out.println("Line read from file: " + line);
                reader.close();
            } catch (IOException e) {
                // Log the exception using a logging framework
                logger.log(Level.SEVERE, "An error occurred while reading the file", e);
                // Handle the exception gracefully
                System.out.println("IOException caught: " + e.getMessage());
            }
        }
    }
    

