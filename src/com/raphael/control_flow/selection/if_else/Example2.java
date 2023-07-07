package com.raphael.control_flow.selection.if_else;

import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your gender?: ");
        String gender = scanner.next();

        if (gender.equalsIgnoreCase("MALE") || gender.equalsIgnoreCase("FEMALE")) {
            System.out.println("Valid Gender");
        }
        else {
            System.out.println("Invalid Gender");
        }
    }

}
