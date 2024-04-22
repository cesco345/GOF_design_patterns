package java_fundamentals.java_basics.classes_4;

import java.util.Random;

public class DiseaseIdentificationSequence {

    // Function to generate a random DNA sequence of specified length
    public static String generateRandomSequence(int length) {
        StringBuilder sequence = new StringBuilder();
        Random random = new Random();
        String nucleotides = "TTTCACCATGAACTATGATCCTCAGTGTTAATGGCGCGGCGTCCGACATTCTACTTATGTCTTGTCGGCACATCAGCGCGACCGTCTAAGCA";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(nucleotides.length());
            sequence.append(nucleotides.charAt(index));
        }

        return sequence.toString();
    }

    // Function to compare DNA sequence with a disease pattern
    public static boolean identifyDisease(String dnaSequence, String diseasePattern) {
        // Check if the disease pattern is a substring of the DNA sequence
        return dnaSequence.contains(diseasePattern);
    }

    public static void main(String[] args) {
        // Generate a random DNA sequence
        String dnaSequence = generateRandomSequence(100);

        // Define a disease pattern
        String diseasePattern = "ATC";

        // Identify disease based on the generated DNA sequence
        boolean isDisease = identifyDisease(dnaSequence, diseasePattern);

        // Output the result
        System.out.println("Generated DNA Sequence: " + dnaSequence);
        if (isDisease) {
            System.out.println("Disease identified based on pattern: " + diseasePattern);
        } else {
            System.out.println("No disease identified.");
        }
    }
}