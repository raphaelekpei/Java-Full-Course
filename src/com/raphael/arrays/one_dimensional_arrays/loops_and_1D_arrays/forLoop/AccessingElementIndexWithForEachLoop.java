package com.raphael.arrays.one_dimensional_arrays.loops_and_1D_arrays.forLoop;

public class AccessingElementIndexWithForEachLoop {
    public static void main(String[] args) {

        String[] names = {"James", "John", "Joe", "Jacob"};
        for (int i = 0; i < names.length; i++) {
            String prev = names[i-1]; // -> to access the previous element
            String current = names[i]; // -> to access the current element
            String next = names[i+1]; // -> to access the next element

        }
    }


}
