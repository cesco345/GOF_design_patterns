package java_fundamentals.java_basics.inheritance_6;

public class ObjectExample {
    public static void main(String[] args) {
        // Create objects of different classes
        MyClass obj1 = new MyClass(1, "Hello");
        MyClass obj2 = new MyClass(2, "World");
        MyClass obj3 = new MyClass(1, "Hello");

        // equals() method example
        System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // false
        System.out.println("obj1.equals(obj3): " + obj1.equals(obj3)); // true

        // hashCode() method example
        System.out.println("HashCode of obj1: " + obj1.hashCode()); // HashCode of obj1
        System.out.println("HashCode of obj2: " + obj2.hashCode()); // HashCode of obj2

        // toString() method example
        System.out.println("toString() of obj1: " + obj1.toString()); // toString() of obj1

        // getClass() method example
        System.out.println("Class of obj1: " + obj1.getClass().getName()); // Class of obj1
    }
}

class MyClass {
    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        MyClass myClass = (MyClass) obj;
        return id == myClass.id && name.equals(myClass.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
