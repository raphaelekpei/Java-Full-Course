package com.raphael.control_flow.selection.if_else;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your age?: \n");
        int age = scanner.nextInt();

        boolean isAdult = age >= 16;
        if (isAdult) {
            System.out.println("is adult");
        }
        else {
            System.out.println("is not an adult");
        }

    }

}
