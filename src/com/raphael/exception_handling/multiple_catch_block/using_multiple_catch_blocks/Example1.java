package com.raphael.exception_handling.multiple_catch_block.using_multiple_catch_blocks;

public class Example1 {

    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1x");
            System.out.println(number);

            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
            System.out.println("end");

        } catch (NumberFormatException e) {
            System.out.println("Failed to pass 1x");
        } catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

    }
}
