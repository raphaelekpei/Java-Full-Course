package com.raphael.control_flow.selection.else_if;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your age?: \n");
        int age = scanner.nextInt();
        scanner.close();

        boolean isAdult = age >= 16;
        if (isAdult) {
            System.out.println("is adult");
        } else if (age == 1) {
            System.out.println("baby");
        } else if (age == 2) {
            System.out.println("toddler");
        } else if (age == 3) {
            System.out.println("toddler");
        } else {
            System.out.println("is not an adult");
        }
    }
}
