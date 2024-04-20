package java_fundamentals.lambdas_11;

import java.util.function.BinaryOperator;

// GenomicsInstrument interface representing a genomics instrument
interface GenomicsInstrument {
    String getSequence();
}

// Example class implementing the GenomicsInstrument interface
class DNASequencer implements GenomicsInstrument {
    private String sequence;

    public DNASequencer(String sequence) {
        this.sequence = sequence;
    }

    @Override
    public String getSequence() {
        return sequence;
    }
}

public class BinaryOperatorGenomicsExample {
    public static void main(String[] args) {
        // Create DNA sequencer objects representing DNA sequences
        DNASequencer sequencer1 = new DNASequencer("ATGCATGCCGGGTCTCACACCAAGGCGCG");
        DNASequencer sequencer2 = new DNASequencer("TAGCTAGCGTCTCTCACACCAAGGCGCGG");

        // Define a binary operator to compare two DNA sequences and find the common nucleotides
        BinaryOperator<String> commonNucleotidesFinder = (sequence1, sequence2) -> {
            StringBuilder commonNucleotides = new StringBuilder();
            for (int i = 0; i < sequence1.length() && i < sequence2.length(); i++) {
                if (sequence1.charAt(i) == sequence2.charAt(i)) {
                    commonNucleotides.append(sequence1.charAt(i));
                }
            }
            return commonNucleotides.toString();
        };

        // Apply the binary operator to the two DNA sequences
        String commonNucleotides = commonNucleotidesFinder.apply(sequencer1.getSequence(), sequencer2.getSequence());

        // Print the common nucleotides found in the two DNA sequences
        System.out.println("Common Nucleotides: " + commonNucleotides);
    }
}
