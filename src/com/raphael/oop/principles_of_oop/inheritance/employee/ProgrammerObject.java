package com.raphael.oop.principles_of_oop.inheritance.employee;


import java.util.Arrays;

public class ProgrammerObject {

    public static void main(String[] args) {

        String[] languages = {"Java", "Python", "JavaScript"};
        Programmer programmer = new Programmer(
                "John",
                21,
                "Lekki",
                "Full Stack",
                languages,
                "Java Developer"
        );

        programmer.write_code();
        System.out.println(programmer.getAddress());
        System.out.println(programmer.getName());
        System.out.println(programmer.getDescription());
        System.out.println(Arrays.toString(programmer.getProgrammingLanguages()));

    }
}
