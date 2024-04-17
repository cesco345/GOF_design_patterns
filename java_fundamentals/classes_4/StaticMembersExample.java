package java_fundamentals.classes_4;

public class StaticMembersExample {
    // Static variable
    private static int counter = 0;

    // Instance variable
    private String name;

    // Constructor
    public StaticMembersExample(String name) {
        this.name = name;
        counter++; // Increment the counter each time a new instance is created
    }

    // Static method to get the current value of the counter
    public static int getCounter() {
        return counter;
    }

    // Instance method to display information
    public void displayInfo() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        // Create objects of StaticExample
        StaticMembersExample obj1 = new StaticMembersExample("Object 1");
        StaticMembersExample obj2 = new StaticMembersExample("Object 2");
        StaticMembersExample obj3 = new StaticMembersExample("Object 3");

        // Call instance method to display information for each object
        obj1.displayInfo();
        obj2.displayInfo();
        obj3.displayInfo();

        // Call static method to get the current value of the counter
        System.out.println("Number of objects created: " + StaticMembersExample.getCounter());
    }
}
