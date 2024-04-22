package java_fundamentals.java_basics.lambdas_11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

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

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }
}

public class UnaryOperatorGenomicsDNA_Sequencer {
    public static void main(String[] args) {
        // Create a list of genomics instruments (DNA sequencers)
        List<DNASequencer> dnaSequencers = new ArrayList<>();
        dnaSequencers.add(new DNASequencer("ATGCATGC")); // DNA sequence 1
        dnaSequencers.add(new DNASequencer("TAGCTAGC")); // DNA sequence 2
        dnaSequencers.add(new DNASequencer("CGATCGAT")); // DNA sequence 3

        // Define a unary operator to convert DNA sequences to RNA sequences
        UnaryOperator<DNASequencer> dnaToRnaConverter = dnaSequencer -> {
            String dnaSequence = dnaSequencer.getSequence();
            StringBuilder rnaSequenceBuilder = new StringBuilder();
            for (char nucleotide : dnaSequence.toCharArray()) {
                switch (nucleotide) {
                    case 'A':
                        rnaSequenceBuilder.append('U');
                        break;
                    case 'T':
                        rnaSequenceBuilder.append('A');
                        break;
                    case 'G':
                        rnaSequenceBuilder.append('C');
                        break;
                    case 'C':
                        rnaSequenceBuilder.append('G');
                        break;
                }
            }
            dnaSequencer.setSequence(rnaSequenceBuilder.toString()); // Update the DNA sequencer with the RNA sequence
            return dnaSequencer;
        };

        // Apply the unary operator to each DNA sequencer to convert DNA sequences to RNA sequences
        dnaSequencers.replaceAll(dnaToRnaConverter);

        // Print the converted RNA sequences
        dnaSequencers.forEach(dnaSequencer ->
                System.out.println("RNA Sequence: " + dnaSequencer.getSequence()));
    }
}
