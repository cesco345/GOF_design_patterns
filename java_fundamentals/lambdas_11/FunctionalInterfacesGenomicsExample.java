package java_fundamentals.lambdas_11;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

public class FunctionalInterfacesGenomicsExample {
    public static void main(String[] args) {
        // Create a list of DNA sequencers representing DNA sequences
        List<DNASequencer> dnaSequencers = new ArrayList<>();
        dnaSequencers.add(new DNASequencer("ATGCATGC")); // DNA sequence 1
        dnaSequencers.add(new DNASequencer("TAGCTAGC")); // DNA sequence 2
        dnaSequencers.add(new DNASequencer("CGATCGAT")); // DNA sequence 3

        // Define a predicate to filter DNA sequences containing 'ATG' sequence
        Predicate<DNASequencer> atgSequenceFilter = dnaSequencer -> dnaSequencer.getSequence().contains("ATG");

        // Define a function to convert DNA sequences to RNA sequences
        Function<DNASequencer, String> dnaToRnaConverter = dnaSequencer -> {
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
            return rnaSequenceBuilder.toString();
        };

        // Define a consumer to print DNA sequences
        Consumer<DNASequencer> dnaSequencePrinter = dnaSequencer ->
                System.out.println("DNA Sequence: " + dnaSequencer.getSequence());

        // Filter DNA sequences containing 'ATG'
        System.out.println("DNA Sequences containing 'ATG':");
        dnaSequencers.stream()
                .filter(atgSequenceFilter)
                .forEach(dnaSequencePrinter);

        // Convert DNA sequences to RNA sequences and print
        System.out.println("\nRNA Sequences:");
        dnaSequencers.stream()
                .map(dnaToRnaConverter)
                .forEach(System.out::println);
    }
}
