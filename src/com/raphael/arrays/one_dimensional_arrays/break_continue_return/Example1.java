package com.raphael.arrays.one_dimensional_arrays.break_continue_return;

public class Example1 {
    public static void main(String[] args) {
        var numbers = new int[] {1, 2, 3, 4, 5};
        for (int number : numbers) {
            if (number == 2) continue;
            if (number == 4) break;
            System.out.println(number);

        }




    }
}
