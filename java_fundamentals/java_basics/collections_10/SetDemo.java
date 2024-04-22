package java_fundamentals.java_basics.collections_10;

import java.util.*;

public class SetDemo {
  public static void show() {
    Set<String> set1 =
      new HashSet<>(Arrays.asList("a", "b", "c"));

    Set<String> set2 =
      new HashSet<>(Arrays.asList("b", "c", "d"));

    // Union
    set1.addAll(set2);
    System.out.println(set1);

    // Intersection
    set1.retainAll(set2);
    System.out.println(set1);

    // Difference
    set1.removeAll(set2);
    System.out.println(set1);

    
  }
  
}
