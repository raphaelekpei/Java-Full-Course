package com.raphael.exception_handling.multiple_catch_block.combining_multiple_catch_blocks_into_one;

public class Example1 {

    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1x");
            System.out.println(number);

            for (int i = 10; i >= 0; i--) {
                System.out.println(10 / i);
            }
            System.out.println("end");

        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
