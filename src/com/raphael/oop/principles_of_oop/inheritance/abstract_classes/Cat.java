package com.raphael.oop.principles_of_oop.inheritance.abstract_classes;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}
