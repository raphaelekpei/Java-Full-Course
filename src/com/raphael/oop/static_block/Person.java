package com.raphael.oop.static_block;

public class Person {

    private static int personCount;
    private String name;

    // Static block
    static {
        System.out.println("start: start of initialization");
        personCount = 0;
        System.out.println("end: Static block executed.");
    }

    public Person(String name) {
        this.name = name;
        personCount++; // this increments each time a person is instantiated

    }

    public Person(){
        personCount++;
    }

    public String getName() {
        return name;
    }

    public static int getPersonCount() {
        return personCount;
    }

    //In this example, the Person class has a static block that initializes the personCount variable to 0.
    // Every time a new Person object is created, the personCount is incremented in the constructor.
    // The getName() method retrieves the name of the person, and
    // the getPersonCount() method returns the total number of Person objects created.

    //Note that the static block is executed only once, before any other code in the class.
    // It initializes the static variable personCount to 0 before any Person objects are created.
}
