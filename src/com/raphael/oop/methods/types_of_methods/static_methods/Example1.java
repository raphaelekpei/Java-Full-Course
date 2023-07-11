package com.raphael.oop.methods.types_of_methods.static_methods;

public class Example1 {
    public static void main(String[] args) {
        int addResult1 = add(10, 10);
        System.out.println(addResult1);
        int addResult2 = add(10, 100);
        System.out.println(addResult2);


        double result2 = multiply(10, 10);
        System.out.println(result2);

        displayName();
        printBrandName("Adidas");
        printBrandName("LG");
        isAdult(17);
        isAdult(14);
    }

    private static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    private static double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    private static void displayName(){
        System.out.println("Raphael");
    }

    private static void printBrandName(String brandName){
        System.out.println(brandName.toUpperCase());
    }

    private static void isAdult(int age){
        if(age >= 16) System.out.println("Adult");
        else System.out.println("Not Adult");
    }
}
