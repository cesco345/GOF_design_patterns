package java_fundamentals.java_basics.classes_4;

public class LowCouplingExample {
    public static void main(String[] args) {
        LightSwitch switch1 = new LightSwitch();
        Light light1 = new Light();
        
        switch1.turnOn(light1);
        switch1.turnOff(light1);
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

class LightSwitch {
    public void turnOn(Light light) {
        light.turnOn();
    }
    
    public void turnOff(Light light) {
        light.turnOff();
    }
}
