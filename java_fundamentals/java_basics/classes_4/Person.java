package java_fundamentals.java_basics.classes_4;

public class Person {
    // Private attributes (data) of the Person class
    private String name;
    private int age;

    // Constructor to initialize the Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to retrieve the name attribute
    public String getName() {
        return name;
    }

    // Setter method to set the name attribute
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to retrieve the age attribute
    public int getAge() {
        return age;
    }

    // Setter method to set the age attribute
    public void setAge(int age) {
        this.age = age;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
