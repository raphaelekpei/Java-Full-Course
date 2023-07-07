package com.raphael.control_flow.iteration.counterControlledLoop.whileLoop.doWhileLoop;

public class Example1 {

    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("hello" + i);
            i++;
        }
        while (i < 10);
    }
}
