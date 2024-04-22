package java_fundamentals.java_basics.inheritance_6;

// Abstract class representing a device that can be controlled by a remote
abstract class Device {
    abstract void powerOn();
    abstract void powerOff();
}

// Concrete class representing a TV device
class TV extends Device {
    @Override
    void powerOn() {
        System.out.println("TV powered on");
    }

    @Override
    void powerOff() {
        System.out.println("TV powered off");
    }

    void changeChannel(int channel) {
        System.out.println("TV channel changed to " + channel);
    }
}

// Concrete class representing a DVD player device
class DVDPlayer extends Device {
    @Override
    void powerOn() {
        System.out.println("DVD player powered on");
    }

    @Override
    void powerOff() {
        System.out.println("DVD player powered off");
    }

    void play() {
        System.out.println("DVD player playing");
    }
}

// Remote control class that can control multiple devices
class RemoteControl {
    void powerOn(Device device) {
        device.powerOn();
    }

    void powerOff(Device device) {
        device.powerOff();
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        // Create instances of TV and DVDPlayer
        TV tv = new TV();
        DVDPlayer dvdPlayer = new DVDPlayer();

        // Create an instance of RemoteControl
        RemoteControl remote = new RemoteControl();

        // Use remote to control TV
        remote.powerOn(tv); // Polymorphism: Device (TV) is treated as a Device
        tv.changeChannel(5);
        remote.powerOff(tv); // Polymorphism: Device (TV) is treated as a Device

        System.out.println();

        // Use remote to control DVDPlayer
        remote.powerOn(dvdPlayer); // Polymorphism: Device (DVDPlayer) is treated as a Device
        dvdPlayer.play();
        remote.powerOff(dvdPlayer); // Polymorphism: Device (DVDPlayer) is treated as a Device
    }
}
