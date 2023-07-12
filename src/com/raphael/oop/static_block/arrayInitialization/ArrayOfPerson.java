package com.raphael.oop.static_block.arrayInitialization;

public class ArrayOfPerson {

    private static Person[] PEOPLE = null;

    static {
        // Initialization code
        PEOPLE = new Person[10];
        // populate the array
        // manually
//        PEOPLE[0] = new Person("John", 25);
//        PEOPLE[1] = new Person("Alice", 30);
//        PEOPLE[2] = new Person("Bob", 35);

        // using for loop
        PEOPLE = new Person[10];
        for (int i = 0; i < PEOPLE.length; i++) {
            PEOPLE[i] = new Person("Person " + (i + 1), 20 + i);
        }
        System.out.println("Static block executed.");
    }

    public static void main(String[] args) {
        System.out.println("People:");
        for (Person person : PEOPLE) {
            System.out.println(person.getName() + " - Age: " + person.getAge());
        }
    }

    // In this example, the StaticBlockExample class has a static block that initializes the PEOPLE array with three Person objects.
    // The main method then prints the names and ages of the people stored in the array.

    // The static block is responsible for initializing the PEOPLE array before it is accessed in the main method.
    // It ensures that the array is populated with Person objects and their respective data before being used elsewhere in the program.
}
