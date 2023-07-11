package com.raphael.oop.setters_and_getters;

public class User {
    private String name;
    private int age;
    private String address;


    public User(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nAddress: " + getAddress();
    }

}
