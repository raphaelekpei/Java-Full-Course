package com.raphael.strings.string_operation;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Jamila";
        // toUpperCase
        System.out.println(name.toUpperCase());

        // toLowerCase
        System.out.println(name.toLowerCase());

        // isBlank
        System.out.println(" ".isBlank());

        // isEmpty
        System.out.println(" ".isEmpty()); // it's not empty - contains white space
        System.out.println(name.isEmpty());

        // trim
        System.out.println("  a  ");
        System.out.println("  a  ".trim());

        System.out.println("   Hello   ");
        System.out.println("   Hello   ".trim());

        // substring()
        System.out.println(name.substring(4));
        System.out.println(name.substring(0, 4));
        System.out.println(name.substring(1));
        System.out.println(name.substring(1, 4));

        // startsWith()
        System.out.println(name.startsWith("J"));

        // replace()
        System.out.println(name.replace("J", ""));
        System.out.println(name.replace("J", "S"));

        // charAt()
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));


    }
}
