package java_fundamentals.java_basics.collections_10;


    import java.util.ArrayDeque;
    import java.util.Queue;
    
    public class CollectionsQueueInterfaceExample {
        public static void main(String[] args) {
            // Create a queue
            Queue<String> myQueue = new ArrayDeque<>();
    
            // Add elements to the queue
            myQueue.offer("Apple");
            myQueue.offer("Banana");
            myQueue.offer("Orange");
            myQueue.offer("Grapes");
    
            // Print the queue
            System.out.println("Original Queue: " + myQueue);
    
            // Peek the element at the front of the queue
            String frontElement = myQueue.peek();
            System.out.println("Element at front of queue: " + frontElement);
    
            // Remove and return the element at the front of the queue
            String removedElement = myQueue.poll();
            System.out.println("Removed element from front of queue: " + removedElement);
            System.out.println("Queue after removal: " + myQueue);
    
            // Check if the queue contains an element
            boolean containsBanana = myQueue.contains("Banana");
            System.out.println("Queue contains 'Banana': " + containsBanana);
    
            // Get the size of the queue
            int size = myQueue.size();
            System.out.println("Size of Queue: " + size);
    
            // Clear the queue
            myQueue.clear();
            System.out.println("Queue after clearing: " + myQueue);
    
            // Check if the queue is empty
            boolean isEmpty = myQueue.isEmpty();
            System.out.println("Is queue empty? " + isEmpty);
        }
    }
    

