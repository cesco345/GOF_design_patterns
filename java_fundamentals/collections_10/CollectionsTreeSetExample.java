package java_fundamentals.collections_10;


    import java.util.Set;
    import java.util.TreeSet;
    
    public class CollectionsTreeSetExample {
        public static void main(String[] args) {
            // Create a set
            Set<String> mySet = new TreeSet<>();
    
            // Add elements to the set
            mySet.add("Apple");
            mySet.add("Banana");
            mySet.add("Orange");
            mySet.add("Grapes");
    
            // Print the set
            System.out.println("Original Set: " + mySet);
    
            // Check if the set contains an element
            boolean containsBanana = mySet.contains("Banana");
            System.out.println("Set contains 'Banana': " + containsBanana);
    
            // Get the size of the set
            int size = mySet.size();
            System.out.println("Size of Set: " + size);
    
            // Remove an element from the set
            boolean removed = mySet.remove("Orange");
            System.out.println("Removed 'Orange': " + removed);
            System.out.println("Set after removal: " + mySet);
    
            // Clear the set
            mySet.clear();
            System.out.println("Set after clearing: " + mySet);
    
            // Check if the set is empty
            boolean isEmpty = mySet.isEmpty();
            System.out.println("Is set empty? " + isEmpty);
        }
    }
    

