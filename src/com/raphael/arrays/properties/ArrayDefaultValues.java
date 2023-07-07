package com.raphael.arrays.properties;

import java.util.Arrays;

public class ArrayDefaultValues {

    public static void main(String[] args) {

        // primitives
        int[] numbers = new int[3];
        numbers[0] = 2;
        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers,-1);
        numbers[0] = 2;
        System.out.println(Arrays.toString(numbers));

        // objects
        String[] names = new String[3];
        names[1] = "Jamila";
        System.out.println(Arrays.toString(names));

        Arrays.fill(names,"foo");
        names[1] = "Jamila";
        System.out.println(Arrays.toString(names));


    }



}
