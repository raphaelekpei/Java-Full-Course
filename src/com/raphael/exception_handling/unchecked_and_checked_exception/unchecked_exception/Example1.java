package com.raphael.exception_handling.unchecked_and_checked_exception.unchecked_exception;

public class Example1 {
    public static void main(String[] args) {

        int number = Integer.parseInt("1");
        System.out.println(number);

        int number2 = Integer.parseInt("1x");
        System.out.println(number2);
    }
}
