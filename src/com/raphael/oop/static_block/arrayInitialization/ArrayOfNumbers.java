package com.raphael.oop.static_block.arrayInitialization;

public class ArrayOfNumbers {

    public static int[] numbers;

    static {
        // Initialization code
        numbers = new int[]{1, 2, 3, 4, 5};
        System.out.println("Static block executed.");

    }

    public static void main(String[] args) {
            System.out.println("Numbers: ");
            for (int num : numbers) {
                System.out.println(num);
            }

        }


    // In this example, the class ArrayInitialization contains a static block that initializes the static array numbers with values [1, 2, 3, 4, 5].
    // The static block is executed once when the class is loaded, and the main method prints the values of the array.

    // The static block is responsible for initializing the array numbers before any other code in the class.
    // It ensures that the array is initialized with the specified values before it is accessed or used in the main method.

}
