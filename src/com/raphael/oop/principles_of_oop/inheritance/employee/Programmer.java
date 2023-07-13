package com.raphael.oop.principles_of_oop.inheritance.employee;

public class Programmer extends Employee{

    private static final int PROGRAMMING_LANGUAGE = 100;
    private String[] programmingLanguages;
    private String description;

    public Programmer(String name, int age, String address, String experience, String[] programmingLanguages, String description) {
        super(name, age, address, experience);
        this.programmingLanguages = programmingLanguages;
        this.description = description;
    }

    public void write_code(){
        System.out.println("I am writing");
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
