package com.raphael.oop.principles_of_oop.inheritance.abstract_classes;

public class CatObject {
    public static void main(String[] args) {

        Dog aja = new Dog("Aja");
        // You can also say:
        Animal bingo = new Dog("Bingo"); // because Dog is an Animal

        // But you cannot say:
//        Dog bingo = new Animal("Bingo"); // because Animal is not a Dog
        Cat john = new Cat("John");
        Animal james = new Cat("James");

        john.makeSound();
        john.walk();

    }
}
