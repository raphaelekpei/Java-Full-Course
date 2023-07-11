package com.raphael.exception_handling.ways_of_handling_exceptions.try_catch_block;

public class Example2 {

    public static void main(String[] args) {

//        for (int i = 10; i > 0; i--) {
//            System.out.println(10 / i);
//        }
//
//        System.out.println();
//
//        for (int i = 10; i >= 0; i--) {
//            System.out.println(10 / i); // This fails when it gets to zero because in java we cannot divide by zero
//        }

        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
            System.out.println("end");
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("finally always runs");
        }

    }
}
