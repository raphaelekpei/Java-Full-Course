package com.raphael.arrays.one_dimensional_arrays.loops_and_1D_arrays.forLoop;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = {5, 4, 3, 2, 1};

        // 1. USING TRADITIONAL FOR LOOP
        // Increment counter
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        // Decrement counter
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        System.out.println();

        // 2. USING ENHANCED FOR LOOP

        for (int number: numbers) {
            System.out.println(number);
        }

    }
}
