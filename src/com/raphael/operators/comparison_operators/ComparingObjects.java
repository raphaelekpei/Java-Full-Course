package com.raphael.operators.comparison_operators;

public class ComparingObjects {

    public static void main(String[] args) {

        String name1 = "John";
        String name2 = "John";

        String name3 = new String("John");


        System.out.println(name1 == name2);
        System.out.println(name1 == name3);

        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));

        String str1 = "Hello";
        String str2 = "World";

        String str3 = "Hello";

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);

        boolean isEqual = str1.equals(str2);
        System.out.println(isEqual);

        System.out.println(str1.equals(str3));

    }




}
