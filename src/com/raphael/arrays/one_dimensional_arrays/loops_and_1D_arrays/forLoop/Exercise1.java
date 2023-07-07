package com.raphael.arrays.one_dimensional_arrays.loops_and_1D_arrays.forLoop;

public class Exercise1 {

    public static void main(String[] args) {
        String[] names = {"James", "John", "Joe", "Jacob"};

        // 1. USING TRADITIONAL FOR LOOP

        // increment counter
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println();

        for (int i = 0; i <= names.length - 1; i++) {
            System.out.println(names[i]);
        }

        System.out.println();

        // decrement counter
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        System.out.println();

        // 2. USING ENHANCED FOR LOOP

        for (String name: names) {
            System.out.println(name);
        }
    }
}
