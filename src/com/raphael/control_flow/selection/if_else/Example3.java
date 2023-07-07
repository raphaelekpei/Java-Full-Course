package com.raphael.control_flow.selection.if_else;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your score: \n");
        int score = scanner.nextInt();

        if (score >= 40 && score <= 100) {
            System.out.println("You passed!");
        }
        else {
            System.out.println("Not yet!");
        }

    }
}
