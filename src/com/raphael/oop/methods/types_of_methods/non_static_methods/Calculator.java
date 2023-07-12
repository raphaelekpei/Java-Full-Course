package com.raphael.oop.methods.types_of_methods.non_static_methods;

public class Calculator {
    public double add(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
    public double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
    public double divide(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }
    public double square(double number) {
        return number * number;
    }
    public double sqrt(double number) {
        return Math.sqrt(number);
    }
    public double max(double numberOne, double numberTwo) {
        return Math.max(numberOne, numberTwo);
    }
    public double min(double numberOne, double numberTwo) {
        return Math.min(numberOne, numberTwo);
    }
    public double power(double baseNumber, double exponent){
        return Math.pow(baseNumber, exponent);
    }


}
