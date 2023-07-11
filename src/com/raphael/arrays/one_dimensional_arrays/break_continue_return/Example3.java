package com.raphael.arrays.one_dimensional_arrays.break_continue_return;

public class Example3 {

    public static void main(String[] args) {
        var names = new String[]{"John", "Joe", "Jacob", "Jerry", "Alice", "Jones"};
        for (String name : names){
            if (name.startsWith("A")) return;
            System.out.println(name);

        }
        System.out.println("End of main method");
        // As soon as we encounter a name that startsWith "A", we want to end the method completely
    }
}
