package java_fundamentals.java_basics.exceptions_8;

public class OutOfMemoryExceptionExample {
    
        public static void main(String[] args) {
            // Attempt to allocate a large array, causing an OutOfMemoryError
            int[] array = new int[Integer.MAX_VALUE];
        }
    }

