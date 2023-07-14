package com.raphael.oop.principles_of_oop.inheritance.abstract_classes;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Wof Wof");
    }
}
