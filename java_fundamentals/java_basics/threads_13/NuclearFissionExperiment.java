package java_fundamentals.java_basics.threads_13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NuclearFissionExperiment {

    public static void main(String[] args) {
        // Number of atoms undergoing fission
        int numAtoms = 1000;
        // Number of threads to use for parallel processing
        int numThreads = 4;

        // Create a fixed-size thread pool
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        // Submit tasks to the executor
        for (int i = 0; i < numAtoms; i++) {
            executor.submit(new FissionTask());
        }

        // Shutdown the executor after all tasks are completed
        executor.shutdown();
    }

    static class FissionTask implements Runnable {
        @Override
        public void run() {
            // Simulate nuclear fission process
            System.out.println("Nuclear fission occurred!");
        }
    }
}