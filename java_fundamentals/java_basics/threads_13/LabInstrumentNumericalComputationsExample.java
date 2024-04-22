package java_fundamentals.java_basics.threads_13;

import java.util.concurrent.ThreadLocalRandom;

public class LabInstrumentNumericalComputationsExample {

    public static void main(String[] args) {
        // Generate data produced by the lab instrument
        double[] data = generateData(1000);

        // Perform numerical computations
        double mean = calculateMean(data);
        double stdDev = calculateStandardDeviation(data);

        // Print results
        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    // Method to generate random data points (for demonstration)
    private static double[] generateData(int numDataPoints) {
        double[] dataPoints = new double[numDataPoints];
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < numDataPoints; i++) {
            dataPoints[i] = random.nextDouble();
        }
        return dataPoints;
    }

    // Method to calculate the mean of the data
    private static double calculateMean(double[] data) {
        double sum = 0;
        for (double d : data) {
            sum += d;
        }
        return sum / data.length;
    }

    // Method to calculate the standard deviation of the data
    private static double calculateStandardDeviation(double[] data) {
        double mean = calculateMean(data);
        double sum = 0;
        for (double d : data) {
            sum += Math.pow(d - mean, 2);
        }
        return Math.sqrt(sum / data.length);
    }
}
