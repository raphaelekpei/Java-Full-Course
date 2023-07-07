package com.raphael.strings;

public class StringMethods {
    public static void main(String[] args) {
        String brand = "Amigoscode";
        // toUpperCase
        System.out.println(brand.toUpperCase());

        // toLowerCase
        System.out.println(brand.toLowerCase());

        // substring
        System.out.println(brand.substring(6));
        System.out.println(brand.substring(0, 6));

        // isEmpty
        // to check whether a string has a character or not
        System.out.println(" ".isEmpty()); // it's not empty - we have white space character
        System.out.println(brand.isEmpty());

        // isBlank
        // to check whether a string contains a character other than white space
        System.out.println(" ".isBlank());

        // trim
        // removes all trailing whitespace characters from a string
        System.out.println("  a  ");
        System.out.println("  a  ".trim());

    }
}
