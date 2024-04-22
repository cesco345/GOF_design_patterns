package java_fundamentals.java_basics.inheritance_6;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches the ball");
    }
}

public class UpcastingDowncastingExample {
    public static void main(String[] args) {
        // Upcasting: Dog object is upcasted to Animal reference
        Animal animal = new Dog();
        animal.makeSound(); // Calls Dog's makeSound method

        // Downcasting: Animal reference is downcasted to Dog reference
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.makeSound(); // Calls Dog's makeSound method
            dog.fetch();     // Calls Dog's fetch method
        }
    }
}

