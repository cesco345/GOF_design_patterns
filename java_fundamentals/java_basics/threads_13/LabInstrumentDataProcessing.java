package java_fundamentals.java_basics.threads_13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LabInstrumentDataProcessing {

    public static void main(String[] args) {
        // Number of data points produced by the lab instrument
        int numDataPoints = 1000;
        // Number of threads to use for parallel processing
        int numThreads = 4;

        // Create a fixed-size thread pool
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // Generate random data points (for demonstration)
        double[] dataPoints = generateDataPoints(numDataPoints);

        // Create a list to hold Future objects
        List<Future<?>> futures = new ArrayList<>();

        // Submit tasks to the executor
        for (double dataPoint : dataPoints) {
            futures.add(executor.submit(new DataProcessingTask(dataPoint)));
        }

        // Wait for all tasks to complete
        for (Future<?> future : futures) {
            try {
                future.get(); // wait for task completion
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor after all tasks are completed
        executor.shutdown();
    }

    static class DataProcessingTask implements Callable<Void> {
        private double dataPoint;

        public DataProcessingTask(double dataPoint) {
            this.dataPoint = dataPoint;
        }

        @Override
        public Void call() {
            // Process the data point (for demonstration)
            double result = processData(dataPoint);
            System.out.println("Processed data point: " + result);
            return null;
        }

        private double processData(double data) {
            // Placeholder for data processing logic (for demonstration)
            // This can be replaced with actual processing logic
            return data * 2;
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
