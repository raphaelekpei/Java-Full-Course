package com.raphael.oop.var_keyword;

public class Example1 {

    public static void main(String[] args) {

        // Note: these are local variables
        var name = "John";
        var names = new String[]{"John", "Joe"};

        var score = 22.5;
        var scores = new double[]{76.5, 90};

        var age = 22;
        var ages = new int[]{18, 58};

        var isAdult = false;
        var balance = 1_000_00.33;

        printName(name);

        var addResult = addTwoNumbers(10, 10);
        System.out.println(addResult);
    }
    public static void printName(String name) {
        System.out.println(name);
    }

    private static int addTwoNumbers(int numberOne, int numberTwo) {
        var result = numberOne + numberTwo; // local variable
        return result;
    }

}
