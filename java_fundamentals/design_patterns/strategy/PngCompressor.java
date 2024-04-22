package java_fundamentals.design_patterns.strategy;

public class PngCompressor implements Compressor {
    public void compress(String fileName) {
        System.out.println("Compressing using PNG");
    }

}
