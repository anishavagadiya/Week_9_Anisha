package calculate;
// Write a Java program to reverse an array of integer values.

import java.util.Arrays;

public class Programme_3 {
    public static void main(String[] args) {
        int[]my_array = {1,2,3,4,5,6,7,8,9};
        System.out.println("Original Array :" + Arrays.toString(my_array));
        //Using for loop
        for (int i = 0; i < my_array.length / 2; i++){
            int temp = my_array[i];
            my_array[i] = my_array[my_array.length - i -1];
            my_array[my_array.length -i -1] = temp;
        }
        System.out.println("Reverse Array : " + Arrays.toString(my_array));
    }

}
