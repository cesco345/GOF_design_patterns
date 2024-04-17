package java_fundamentals.classes_4;

public class ConstructorOverloadingExample {
    private String name;
    private int age;

    // Constructor with no parameters
    public ConstructorOverloadingExample() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Constructor with one parameter (name)
    public ConstructorOverloadingExample(String name) {
        this.name = name;
        this.age = 0;
    }

    // Constructor with two parameters (name and age)
    public ConstructorOverloadingExample(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create objects using different constructors
        ConstructorOverloadingExample obj1 = new ConstructorOverloadingExample();
        ConstructorOverloadingExample obj2 = new ConstructorOverloadingExample("John");
        ConstructorOverloadingExample obj3 = new ConstructorOverloadingExample("Alice", 25);

        // Display information for each object
        System.out.println("Object 1:");
        obj1.displayInfo();
        System.out.println();

        System.out.println("Object 2:");
        obj2.displayInfo();
        System.out.println();

        System.out.println("Object 3:");
        obj3.displayInfo();
    }
}
