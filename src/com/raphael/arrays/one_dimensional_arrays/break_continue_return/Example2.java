package com.raphael.arrays.one_dimensional_arrays.break_continue_return;

public class Example2 {
    public static void main(String[] args) {
        var names = new String[]{"John", "Joe", "Jacob", "Jerry", "Alice", "Jones"};
        for (String name : names){
            if (name.startsWith("A") || name.endsWith("s")) continue;
            System.out.println(name);

        }

    }
}
