package com.raphael.constants.enums;


import java.util.Arrays;

public class GenderApplication {

    public static void main(String[] args) {
        // Using the enum values

        Gender male = Gender.MALE;
        System.out.println(male);

        Gender female = Gender.FEMALE;
        System.out.println(female);

        // Enum Methods

        // 1. valueof()
        Gender gender1 = Gender.valueOf("MALE");
        System.out.println(gender1);

        Gender gender2 = Gender.valueOf("FEMALE");
        System.out.println(gender2);
        // OR
        System.out.println(Gender.valueOf("FEMALE"));
        System.out.println(Gender.valueOf("MALE"));

        System.out.println();

        // 2. values()

        System.out.println(Arrays.toString(Gender.values()));
        // OR
        Gender[] genders = Gender.values();
        System.out.println(Arrays.toString(genders));

        System.out.println();

        // Looping Through the enum values

        for(Gender gender :Gender.values()){
            System.out.println(gender);
        }
        // OR
        for (Gender gender :genders){
            System.out.println(gender);
        }


    }
}
