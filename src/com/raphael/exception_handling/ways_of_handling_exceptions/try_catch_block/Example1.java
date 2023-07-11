package com.raphael.exception_handling.ways_of_handling_exceptions.try_catch_block;

public class Example1 {
    public static void main(String[] args) {

//        int number = Integer.parseInt("1");
//        System.out.println(number);
//
//         number = Integer.parseInt("1x");
// this throws an exception because we cannot convert 1x into integer. 1x is not a valid number
//         System.out.println(number);

        try {
            int number = Integer.parseInt("1x");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Failed to pass 1x");
        }
        finally {
            System.out.println("finally always runs");
        }

    }
}
