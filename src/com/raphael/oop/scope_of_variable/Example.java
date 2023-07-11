package com.raphael.oop.scope_of_variable;

public class Example {

    // global variables
    private static final String BRAND = "Gucci"; // only accessible within the class
    public static final double WEIGHT = 1.0; // accessible within or outside the class

    public static void main(String[] args) {
        System.out.println(BRAND);
        foo();

        // local variables
        var country = "England";
        var BRAND = "Adidas";
        System.out.println(country);
        System.out.println(BRAND);
    }

    private static void foo(){
        System.out.println(BRAND);

    }
}
