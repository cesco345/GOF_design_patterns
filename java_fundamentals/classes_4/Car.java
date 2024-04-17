package java_fundamentals.classes_4;

public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor for the Car class
    public Car() {
        this.make = "Ford";
        this.model = "Mustang";
        this.year = 0;
    }

    // Getters and setters for Car attributes
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Create a new Car object using the constructor
        Car myCar = new Car();

        // Display information about the car
        myCar.displayInfo();
    }
}



