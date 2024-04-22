package java_fundamentals.java_basics.threads_13;

import java.util.concurrent.ThreadLocalRandom;

public class MonteCarloPiEstimation {

    public static void main(String[] args) {
        int numPoints = 1000000;
        int numThreads = 4; // Number of threads to use for parallel processing
        int pointsPerThread = numPoints / numThreads;

        PiEstimationTask[] tasks = new PiEstimationTask[numThreads];
        Thread[] threads = new Thread[numThreads];

        // Create and start threads
        for (int i = 0; i < numThreads; i++) {
            tasks[i] = new PiEstimationTask(pointsPerThread);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        // Wait for all threads to complete
        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Aggregate results from all threads
        int totalPointsInsideCircle = 0;
        for (PiEstimationTask task : tasks) {
            totalPointsInsideCircle += task.getPointsInsideCircle();
        }

        // Estimate the value of pi
        double pi = 4.0 * totalPointsInsideCircle / numPoints;
        System.out.println("Estimated value of pi: " + pi);
    }

    static class PiEstimationTask implements Runnable {
        private final int numPoints;
        private int pointsInsideCircle;

        public PiEstimationTask(int numPoints) {
            this.numPoints = numPoints;
        }

        @Override
        public void run() {
            pointsInsideCircle = 0;
            ThreadLocalRandom random = ThreadLocalRandom.current();

            for (int i = 0; i < numPoints; i++) {
                double x = random.nextDouble();
                double y = random.nextDouble();
                if (x * x + y * y <= 1) {
                    pointsInsideCircle++;
                }
            }
        }

        public int getPointsInsideCircle() {
            return pointsInsideCircle;
        }
    }
}

