package java_fundamentals.collections_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Define a class representing an employee
class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    // Constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Implement compareTo method for natural ordering
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    // Override toString method for printing
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class CollectionsComparableInterfaceExample {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John"));
        employees.add(new Employee(103, "Alice"));
        employees.add(new Employee(102, "Bob"));

        // Sort the list using natural ordering (based on employee ID)
        Collections.sort(employees);

        // Print the sorted list of employees
        System.out.println("Sorted list of employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}