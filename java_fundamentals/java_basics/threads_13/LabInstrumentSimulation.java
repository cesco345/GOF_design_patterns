package java_fundamentals.java_basics.threads_13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

public class LabInstrumentSimulation {

    public static void main(String[] args) {
        // Number of data points produced by the lab instrument
        int numDataPoints = 1000;
        // Number of threads to use for parallel processing
        int numThreads = 4;

        // Create a fixed-size thread pool
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // Generate random data points (for demonstration)
        double[] dataPoints = generateDataPoints(numDataPoints);

        // Submit tasks to the executor
        for (double dataPoint : dataPoints) {
            executor.submit(new SimulationTask(dataPoint));
        }

        // Shutdown the executor after all tasks are completed
        executor.shutdown();
    }

    static class SimulationTask implements Runnable {
        private double dataPoint;

        public SimulationTask(double dataPoint) {
            this.dataPoint = dataPoint;
        }

        @Override
        public void run() {
            // Perform simulation based on data point (for demonstration)
            simulate(dataPoint);
        }

        private void simulate(double data) {
            // Placeholder for simulation logic (for demonstration)
            // This can be replaced with actual simulation logic
            System.out.println("Simulating with data point: " + data);
        }
    }

    // Method to generate random data points (for demonstration)
    private static double[] generateDataPoints(int numDataPoints) {
        double[] dataPoints = new double[numDataPoints];
        ThreadLocalRandom random = ThreadLocalRandom.current();
        for (int i = 0; i < numDataPoints; i++) {
            dataPoints[i] = random.nextDouble();
        }
        return dataPoints;
    }
}
