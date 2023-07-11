package com.raphael.oop.setters_and_getters;

public class UserObject {

    public static void main(String[] args) {

        User userOne = new User("John", 16, "37 Jordan Street, Lagos Island");
        String name = userOne.getName();
        int age = userOne.getAge();
        String address = userOne.getAddress();
        System.out.println("New User Details: \n" + name + " \n" + age + " \n" + address);

        userOne.setName("Jay");
        userOne.setAge(18);
        userOne.setAddress("37 Peter Street Lagos, Nigeria");

        System.out.println("Updated User Details: \n"+ userOne.getName() + " \n" + userOne.getAge() + " \n" + userOne.getAddress());



        User userTwo = new User("Jacob", 24, "White");

        var userThree = new User("Joe", 35, "grey");
    }
}
