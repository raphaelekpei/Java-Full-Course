package com.raphael.oop.constructor.constructor_chaining;

public class User {

    private String name;
    private int age;
    private String address;

    private int password;
    private String email;

    public User(){

    }

    public User(String name, int age, String address, int password, String email) {
        this(name, age, address, password);
        this.email = email;
    }

    public User(String name, int age, String address, int password) {
        this(name, age, address);
        this.password = password;
    }


    public User(String name, int age, String address){
        this(name, age);
        this.address = address;

    }
    public User(String name, int age){
        this.name = name;
        this.age = age;

    }
    public User(String name, String address){
        this.name = name;
        this.address = address;

    }
    public User(int age, String address){
        this.age = age;
        this.address = address;
    }

    public User(String name){
        this.name = name;

    }
    public User(int age){
        this.age = age;
    }

}
