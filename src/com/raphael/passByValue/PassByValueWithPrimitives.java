package com.raphael.passByValue;

public class PassByValueWithPrimitives {

    public static void main(String[] args) {
        int age = 21;
        int ageCopy = increment(age);
        System.out.println(age);
        System.out.println(ageCopy);
    }

    public static int increment(int age) {
        return ++age;
    }

}
