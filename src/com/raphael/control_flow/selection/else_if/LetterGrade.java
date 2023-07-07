package com.raphael.control_flow.selection.else_if;

import java.util.Scanner;

public class LetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your letter grade?: \n");
        char grade = scanner.next().charAt(0);
        scanner.close();

        if (grade == 'A') {
            System.out.println("Excellent");
        } else if (grade == 'B') {
            System.out.println("Good");
        } else if (grade == 'C' || grade == 'D') {
            System.out.println("Pass");
        } else if (grade == 'E') {
            System.out.println("You can do better");
        } else if (grade == 'F') {
            System.out.println("Not yet!");
        } else {
            System.out.println("Invalid Grade");
        }

    }
}
