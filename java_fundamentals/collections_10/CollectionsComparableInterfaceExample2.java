package java_fundamentals.collections_10;


    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;
    
    // Define a class representing a product
    class Product implements Comparable<Product> {
        private int id;
        private String name;
        private double price;
    
        // Constructor
        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
    
        // Getter methods
        public int getId() {
            return id;
        }
    
        public String getName() {
            return name;
        }
    
        public double getPrice() {
            return price;
        }
    
        // Implement compareTo method for natural ordering based on price
        @Override
        public int compareTo(Product other) {
            return Double.compare(this.price, other.price);
        }
    
        // Override toString method for printing
        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
    
    public class CollectionsComparableInterfaceExample2 {
        public static void main(String[] args) {
            // Create a list of products
            List<Product> products = new ArrayList<>();
            products.add(new Product(101, "Laptop", 999.99));
            products.add(new Product(102, "Smartphone", 499.99));
            products.add(new Product(103, "Tablet", 299.99));
    
            // Print the list of products before sorting
            System.out.println("List of products before sorting:");
            for (Product product : products) {
                System.out.println(product);
            }
    
            // Sort the list of products based on natural ordering (price)
            Collections.sort(products);
    
            // Print the sorted list of products
            System.out.println("\nList of products after sorting:");
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

