package com.raphael.control_flow.selection.switch_case.traditonal_switch_case;

import java.util.Scanner;

public class LetterGrade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your letter grade?: \n");
        char grade = scanner.next().charAt(0);
        scanner.close();

        switch (grade) {
            case 'A' -> System.out.println("Excellent");
            case 'B' -> System.out.println("Good");
            case 'C', 'D' -> System.out.println("Pass");
            case 'E' -> System.out.println("You can do better");
            case 'F' -> System.out.println("Not yet!");
            default -> System.out.println("Invalid Grade");
        }
    }
}
