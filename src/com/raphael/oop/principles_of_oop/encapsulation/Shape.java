package com.raphael.oop.principles_of_oop.encapsulation;

public class Shape {

    private int length;

    public Shape(int length) {
        this.length = length;
    }

    public int calArea(){
        return length * length;
    }
}
