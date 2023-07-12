package com.raphael.oop.methods.types_of_methods.non_static_methods;

public class SimpleCalculator {

    public static void main(String[] args) {

        SimpleCalculator simpleCalculator = new SimpleCalculator();

        double addResult1 = simpleCalculator.add(2, 2);
        System.out.println(addResult1);

        double addResult2 = simpleCalculator.add(10, 100);
        System.out.println(addResult2);

        double multiplyResult = simpleCalculator.multiply(10, 10);
        System.out.println(multiplyResult);

        System.out.println(simpleCalculator.divide(100, 10));
        System.out.println(simpleCalculator.square(10));
        System.out.println(simpleCalculator.sqrt(100));
        System.out.println(simpleCalculator.max(100, 10));
        System.out.println(simpleCalculator.min(100, 10));
        System.out.println(simpleCalculator.power(2, 3));

    }

    private double add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    private double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }
    private double divide(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }
    private double square(double number) {
        return number * number;
    }
    private double sqrt(double number) {
        return Math.sqrt(number);
    }
    private double max(double numberOne, double numberTwo) {
        return Math.max(numberOne, numberTwo);
    }
    private double min(double numberOne, double numberTwo) {
        return Math.min(numberOne, numberTwo);
    }
    private double power(double baseNumber, double exponent){
        return Math.pow(baseNumber, exponent);
    }
}
