package com.raphael.oop.methods.types_of_methods.static_methods;

public class SimpleCalculator {

    public static void main(String[] args) {

        int addResult1 = add(2, 2);
        System.out.println(addResult1);

        int addResult2 = add(10, 100);
        System.out.println(addResult2);

        double result2 = multiply(10, 10);
        System.out.println(result2);

        System.out.println(divide(100, 10));
        System.out.println(square(10));
        System.out.println(sqrt(100));
        System.out.println(max(100, 10));
        System.out.println(min(100, 10));
        System.out.println(power(2, 3));

    }

    private static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    private static double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
    private static double divide(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }
    private static double square(double number) {
        return number * number;
    }
    private static double sqrt(double number) {
        return Math.sqrt(number);
    }
    private static double max(double numberOne, double numberTwo) {
        return Math.max(numberOne, numberTwo);
    }
    private static double min(double numberOne, double numberTwo) {
        return Math.min(numberOne, numberTwo);
    }
    private static double power(double baseNumber, double exponent){
        return Math.pow(baseNumber, exponent);
    }
}
