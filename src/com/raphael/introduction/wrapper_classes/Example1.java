package com.raphael.introduction.wrapper_classes;

public class Example1 {

    public static void main(String[] args) {
        Integer score = 20;
        Double amount = 206.33;

        // convert a string to integer
        var ageStr = "55";
        int age = Integer.parseInt(ageStr);
        System.out.println(age);

        // to get the minimum of two
        System.out.println(Integer.min(20, 5));
        System.out.println(Integer.min(-1, 5));

        // convert a string to a double
        var priceStr = "206.33";
        double price = Double.parseDouble(priceStr);
        System.out.println(price);
    }

}
