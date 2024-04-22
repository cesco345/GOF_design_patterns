package arrays_1;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        int[] numbers2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(numbers)); // [10, 20, 30, 0, 0]
        System.out.println(Arrays.toString(numbers2)); // [10, 20, 30, 40, 50]
        
    }

}
