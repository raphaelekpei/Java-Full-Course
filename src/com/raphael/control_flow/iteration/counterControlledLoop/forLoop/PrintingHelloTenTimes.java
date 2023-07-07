package com.raphael.control_flow.iteration.counterControlledLoop.forLoop;

public class PrintingHelloTenTimes {
    public static void main(String[] args) {
        // increment counter
        for (int i = 0; i <=10 ; i++) {
            System.out.println("Hello " + i);
        }

        System.out.println();

        // decrement counter
        for (int i = 10; i >= 0 ; i--) {
            System.out.println("Hello " + i);
        }
    }
}
