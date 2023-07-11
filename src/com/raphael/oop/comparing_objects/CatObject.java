package com.raphael.oop.comparing_objects;


public class CatObject {
    public static void main(String[] args) {

        Cat cat1 = new Cat("John", 4, "White");

        Cat cat2 = cat1;

        Cat cat3 = new Cat("Jacob", 6, "Black");

        Cat cat4 = new Cat("John", 4, "White");

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        System.out.println(cat1 == cat3);
        System.out.println(cat1.equals(cat3));

        System.out.println(cat1 == cat4);
        System.out.println(cat1.equals(cat4));

    }
}
