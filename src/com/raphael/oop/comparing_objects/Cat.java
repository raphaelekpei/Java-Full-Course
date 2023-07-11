package com.raphael.oop.comparing_objects;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(skinColor, cat.skinColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, skinColor);
    }
}
