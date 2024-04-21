package java_fundamentals.streams_12;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum ProteinType {
    ENZYME,
    HORMONE,
    STRUCTURAL,
    TRANSPORT,
    REGULATORY
}

class Protein {
    private String name;
    private ProteinType type;

    public Protein(String name, ProteinType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public ProteinType getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}

public class GenomicsDeviceDataPartitioning {

    public static void main(String[] args) {
        // Simulate data produced by the genomics device
        List<Protein> proteins = Arrays.asList(
                // List of proteins here
                // First 25 proteins
                new Protein("Insulin", ProteinType.HORMONE),
                new Protein("Pepsin", ProteinType.ENZYME),
                new Protein("Collagen", ProteinType.STRUCTURAL),
                new Protein("Hemoglobin", ProteinType.TRANSPORT),
                new Protein("Lac Operon", ProteinType.REGULATORY),
                new Protein("Glucagon", ProteinType.HORMONE),
                new Protein("Keratin", ProteinType.STRUCTURAL),
                new Protein("ATP Synthase", ProteinType.ENZYME),
                new Protein("Estrogen", ProteinType.HORMONE),
                new Protein("Trypsin", ProteinType.ENZYME),
                new Protein("Actin", ProteinType.STRUCTURAL),
                new Protein("Myosin", ProteinType.STRUCTURAL),
                new Protein("Insulin-like Growth Factor", ProteinType.HORMONE),
                new Protein("Amylase", ProteinType.ENZYME),
                new Protein("Fibrinogen", ProteinType.STRUCTURAL),
                new Protein("Thrombin", ProteinType.ENZYME),
                new Protein("Erythropoietin", ProteinType.HORMONE),
                new Protein("Chymotrypsin", ProteinType.ENZYME),
                new Protein("Keratinocyte Growth Factor", ProteinType.HORMONE),
                new Protein("Collagenase", ProteinType.ENZYME),
                new Protein("Neurotensin", ProteinType.HORMONE),
                new Protein("Glycogen Phosphorylase", ProteinType.ENZYME),
                new Protein("Albumin", ProteinType.TRANSPORT),
                new Protein("Hemocyanin", ProteinType.TRANSPORT),

                // Next 25 proteins
                new Protein("Fibrillin", ProteinType.STRUCTURAL),
                new Protein("Insulin Receptor", ProteinType.REGULATORY),
                new Protein("Cytochrome C", ProteinType.ENZYME),
                new Protein("Oxytocin", ProteinType.HORMONE),
                new Protein("Insulin-like Growth Factor Receptor", ProteinType.REGULATORY),
                new Protein("Cytochrome P450", ProteinType.ENZYME),
                new Protein("Angiotensinogen", ProteinType.REGULATORY),
                new Protein("Cholecystokinin", ProteinType.HORMONE),
                new Protein("Prolactin", ProteinType.HORMONE),
                new Protein("Thyroid-stimulating Hormone", ProteinType.HORMONE),
                new Protein("Pepsinogen", ProteinType.ENZYME),
                new Protein("Glucagon-like Peptide-1", ProteinType.HORMONE),
                new Protein("Lipoprotein Lipase", ProteinType.ENZYME),
                new Protein("Thyroxine-binding Globulin", ProteinType.TRANSPORT),
                new Protein("Trypsinogen", ProteinType.ENZYME),
                new Protein("Erythropoietin Receptor", ProteinType.REGULATORY),
                new Protein("Gastrin", ProteinType.HORMONE),
                new Protein("Fibronectin", ProteinType.STRUCTURAL),
                new Protein("Collagenase", ProteinType.ENZYME),
                new Protein("Glucagon Receptor", ProteinType.REGULATORY),
                new Protein("Thrombopoietin", ProteinType.HORMONE),
                new Protein("Thrombomodulin", ProteinType.ENZYME),
                new Protein("Pancreatic Polypeptide", ProteinType.HORMONE),
                new Protein("Triiodothyronine-binding Globulin", ProteinType.TRANSPORT)
        );

        // Partition proteins into enzymes and non-enzymes
        Map<Boolean, List<Protein>> partitionedProteins = proteins.stream()
                .collect(Collectors.partitioningBy(p -> p.getType() == ProteinType.ENZYME));

        // Print the partitioned data
        System.out.println("Enzymes:");
        partitionedProteins.get(true).forEach(System.out::println);

        System.out.println("\nNon-enzymes:");
        partitionedProteins.get(false).forEach(System.out::println);
    }
}
