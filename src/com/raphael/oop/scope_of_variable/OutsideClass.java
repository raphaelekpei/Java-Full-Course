package com.raphael.oop.scope_of_variable;

public class OutsideClass {

    public void foo(){
        System.out.println(Example.WEIGHT);

        var weight = Example.WEIGHT;
        System.out.println(weight);

    }
}
