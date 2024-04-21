package java_fundamentals.streams_12;

import java.util.Arrays;


public class CreatingStreams {
   public static void main(String[] args){
     int [] numbers = {1, 2, 3, 4, 5};
     Arrays.stream(numbers)
           .forEach(n -> System.out.println(n));
   }
        
    }


