package com.raphael.oop.methods.types_of_methods.non_static_methods;


public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double addResult1 = calculator.add(10, 10);
        System.out.println(addResult1);

        double addResult2 = calculator.add(10, 100);
        System.out.println(addResult2);

        double multiplyResult = calculator.multiply(10, 10);
        System.out.println(multiplyResult);

        System.out.println(calculator.divide(100, 10));
        System.out.println(calculator.square(10));
        System.out.println(calculator.sqrt(100));
        System.out.println(calculator.max(100, 10));
        System.out.println(calculator.min(100, 10));
        System.out.println(calculator.power(2, 3));

    }
}
