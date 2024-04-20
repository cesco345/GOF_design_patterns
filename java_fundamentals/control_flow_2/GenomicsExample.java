package java_fundamentals.control_flow_2;

import java.util.Random;

public class GenomicsExample {

    // Function to generate a random DNA sequence of specified length
    public static String generateRandomSequence(int length) {
        StringBuilder sequence = new StringBuilder();
        Random random = new Random();
        String nucleotides = "ATGC";

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(nucleotides.length());
            sequence.append(nucleotides.charAt(index));
        }

        return sequence.toString();
    }

    // Function to count occurrences of a specific nucleotide in a DNA sequence
    public static int countNucleotideOccurrences(String sequence, char nucleotide) {
        int count = 0;
        for (int i = 0; i < sequence.length(); i++) {
            if (sequence.charAt(i) == nucleotide) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Generate a random DNA sequence of length 50
        String dnaSequence = generateRandomSequence(100);

        // Analyze the DNA sequence
        System.out.println("Generated DNA Sequence: " + dnaSequence);
        System.out.println("Occurrences of 'A': " + countNucleotideOccurrences(dnaSequence, 'A'));
        System.out.println("Occurrences of 'T': " + countNucleotideOccurrences(dnaSequence, 'T'));
        System.out.println("Occurrences of 'G': " + countNucleotideOccurrences(dnaSequence, 'G'));
        System.out.println("Occurrences of 'C': " + countNucleotideOccurrences(dnaSequence, 'C'));
    }
}
