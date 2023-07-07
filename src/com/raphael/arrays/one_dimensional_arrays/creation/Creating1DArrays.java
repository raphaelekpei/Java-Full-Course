package com.raphael.arrays.one_dimensional_arrays.creation;

import java.util.Arrays;

public class Creating1DArrays {

    public static void main(String[] args) {

        // Definition
        int[] numbers = new int[3];

        // Initialization

        // Method 1:
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
//        numbers[3] = 4; throws an ArrayIndexOutOfBoundsException


        // Method 2: Array Initializer

        int[] scores = {1, 2, 3};

        // printing the contents of an array - Arrays.toString()
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(scores));

        // changing the elements of an array
        numbers[0] = 4;
        numbers[1] = 5;

        System.out.println(Arrays.toString(numbers));

        scores[0] = 10;
        scores[1] = 11;
        System.out.println();



    }

}
