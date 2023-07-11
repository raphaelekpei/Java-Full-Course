package com.raphael.oop.setters_and_getters;

public class Cat {

    private String name;
    private int age;
    private String skinColor;


    public Cat(String name, int age, String skinColor){
        this.name = name;
        this.age = age;
        this.skinColor = skinColor;
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

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String toString() {
        return "Cat{" + "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", skinColor='" + getSkinColor() + '\'' +
                "}";
    }



}
