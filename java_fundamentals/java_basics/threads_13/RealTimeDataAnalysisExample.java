package java_fundamentals.java_basics.threads_13;

import java.util.concurrent.ThreadLocalRandom;

public class RealTimeDataAnalysisExample {

    public static void main(String[] args) {
        // Simulate continuous data acquisition from the lab instrument
        while (true) {
            // Get new data point from the instrument
            double newDataPoint = fetchDataPoint();

            // Perform real-time analysis on the new data point
            performAnalysis(newDataPoint);

            // Pause for a short time (simulating real-time data acquisition)
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to simulate fetching a new data point from the lab instrument
    private static double fetchDataPoint() {
        // For demonstration, generate a random data point between 0 and 1
        return ThreadLocalRandom.current().nextDouble();
    }

    // Method to perform real-time analysis on the data point
    private static void performAnalysis(double dataPoint) {
        // For demonstration, simply print out the data point
        System.out.println("New data point: " + dataPoint);
    }
}
