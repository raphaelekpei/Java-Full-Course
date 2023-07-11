package com.raphael.operators.logical_operator;

public class LogicalOperators {
    public static void main(String[] args) {

        // Example 1:
        int a = 1;
        int b = 2;

        boolean result1 = (a > 5) && (b < 10);
        System.out.println(result1);

        boolean result2 = (a > 5) || (b < 10);
        System.out.println(result2);

        boolean result3 = !(a > b);
        System.out.println(result3);



        System.out.println();

        // Example 2:
        boolean isAdult = false;
        boolean isChild = !isAdult;
        System.out.println(isAdult);
        System.out.println(isChild);

        System.out.println();

        // Example 3:
        System.out.println(10 > 2 && 10 < 20);
        System.out.println(10 >= 10 && 10 <= 20);
        System.out.println(10 < 10 && 10 > 20 && 10 <= 20);
        System.out.println(10 <= 10);
        System.out.println(10 == 10);
        System.out.println(10 != 10);

    }

}
