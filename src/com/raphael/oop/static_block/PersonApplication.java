package com.raphael.oop.static_block;

public class PersonApplication {

    static {
        System.out.println("static initializer in main");
    }

    public static void main(String[] args) {
        Person person1 = new Person("John");
        Person person2 = new Person("Alice");

        System.out.println(person1.getName());
        System.out.println(person2.getName());

        System.out.println("Total persons: " + Person.getPersonCount());

        Person person3 = new Person();
        System.out.println(person3.getName());

        System.out.println("Total persons: " + Person.getPersonCount());

    }

}
