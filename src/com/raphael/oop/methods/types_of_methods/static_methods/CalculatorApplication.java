package com.raphael.oop.methods.types_of_methods.static_methods;


public class CalculatorApplication {

    public static void main(String[] args) {
        double addResult1 = Calculator.add(10, 10);
        System.out.println(addResult1);

        double addResult2 = Calculator.add(10, 100);
        System.out.println(addResult2);

        double multiplyResult = Calculator.multiply(10, 10);
        System.out.println(multiplyResult);

        System.out.println(Calculator.divide(100, 10));
        System.out.println(Calculator.square(10));
        System.out.println(Calculator.sqrt(100));
        System.out.println(Calculator.max(100, 10));
        System.out.println(Calculator.min(100, 10));
        System.out.println(Calculator.power(2, 3));

    }
}
