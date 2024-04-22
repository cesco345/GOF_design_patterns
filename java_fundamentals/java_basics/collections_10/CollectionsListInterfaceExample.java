package java_fundamentals.java_basics.collections_10;
import java.util.ArrayList;
import java.util.List;

public class CollectionsListInterfaceExample {
    public static void main(String[] args) {
        // Create a List to store InstrumentData objects
        List<InstrumentData> dataList = new ArrayList<>();

        // Simulate collecting data from instrumentation devices
        collectData(dataList);

        // Display collected data
        displayData(dataList);
    }

    // Method to collect data from instrumentation devices and add it to the list
    public static void collectData(List<InstrumentData> dataList) {
        // Simulate collecting data from multiple sensors
        dataList.add(new InstrumentData("Temperature", 25.5));
        dataList.add(new InstrumentData("Pressure", 1013.2));
        dataList.add(new InstrumentData("Humidity", 60.0));
        // Add more data points as needed
    }

    // Method to display collected data
    public static void displayData(List<InstrumentData> dataList) {
        System.out.println("Collected Data:");
        for (InstrumentData data : dataList) {
            System.out.println(data);
        }
    }
}
    // Class representing an instrumentation data point
    class InstrumentData {
        private String sensorName;
        private double value;
    
        // Constructor
        public InstrumentData(String sensorName, double value) {
            this.sensorName = sensorName;
            this.value = value;
        }
    
        // Getter methods
        public String getSensorName() {
            return sensorName;
        }
    
        public double getValue() {
            return value;
        }
    
        // Override toString method for printing
        @Override
        public String toString() {
            return "InstrumentData{" +
                    "sensorName='" + sensorName + '\'' +
                    ", value=" + value +
                    '}';
        }
    }
    
    
       
    

