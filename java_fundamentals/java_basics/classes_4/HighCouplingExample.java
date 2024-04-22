package java_fundamentals.java_basics.classes_4;

public class HighCouplingExample {
    public static void main(String[] args) {
        Light light1 = new Light();
        light1.turnOn();
        light1.turnOff();
    }
}

class Light {
    public void turnOn() {
        System.out.println("Light is on");
    }

    public void turnOff() {
        System.out.println("Light is off");
    }
}
