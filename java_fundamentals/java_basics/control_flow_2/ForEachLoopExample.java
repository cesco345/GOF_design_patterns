package java_fundamentals.java_basics.control_flow_2;
import java.util.ArrayList;

public class ForEachLoopExample {

    
        public static void main(String[] args) {
            ArrayList<String> studentNames = new ArrayList<>();
            studentNames.add("Alice");
            studentNames.add("Bob");
            studentNames.add("Charlie");
            studentNames.add("David");
            studentNames.add("Eve");
    
            // Using for-each loop to print each student's name
            for (String name : studentNames) {
                System.out.println(name);
            }
        }
    }
    

