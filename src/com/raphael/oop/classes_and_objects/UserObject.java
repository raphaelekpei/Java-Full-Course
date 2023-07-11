package com.raphael.oop.classes_and_objects;

public class UserObject {

    public static void main(String[] args) {
        User userOne = new User();
        userOne.makeSound("John");
        userOne.walk();

        User userTwo = new User();
        userTwo.makeSound("Jacob");
        userTwo.walk();
    }


}
