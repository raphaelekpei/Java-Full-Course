package com.raphael.oop.static_block;

public class TwoIntegers {

    public static int numberOne;
    public static int numberTwo;

    static {
        // Initialization code
        System.out.println("start: start initialization.");
        numberOne = 5;
        numberTwo = 10;
        System.out.println("end: Static block executed.");
    }

    // The static block is executed first, initializing the values of numberOne and numberTwo.
    // Then, in the main method, the initialized values are printed.


}
