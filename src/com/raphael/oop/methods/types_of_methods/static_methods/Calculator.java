package com.raphael.oop.methods.types_of_methods.static_methods;

public class Calculator {

    public static double add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }
    public static double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
    public static double divide(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }
    public static double square(double number) {
        return number * number;
    }
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }
    public static double max(double numberOne, double numberTwo) {
        return Math.max(numberOne, numberTwo);
    }
    public static double min(double numberOne, double numberTwo) {
        return Math.min(numberOne, numberTwo);
    }
    public static double power(double baseNumber, double exponent){
        return Math.pow(baseNumber, exponent);
    }
    
}
