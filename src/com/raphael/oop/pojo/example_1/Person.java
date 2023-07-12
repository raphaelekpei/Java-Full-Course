package com.raphael.oop.pojo.example_1;

import java.util.Arrays;
import java.util.Objects;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private Gender gender;
    private Cat[] cats;

    private Car[] cars;

    private static int personCount = 0;


    public Person(String firstName, String lastName, int age, Address address, Gender gender, Cat[] cats, Car[] cars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.gender = gender;
        this.cats = cats;
        this.cars = cars;
        personCount++; // this increments when a person is instantiated
    }

    public Person(String firstName, String lastName, int age, Address address, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.gender = gender;
        personCount++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Cat[] getCats() {
        return cats;
    }

    public void setCats(Cat[] cats) {
        this.cats = cats;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address=" + address +
                ", gender=" + gender +
                ", cats=" + Arrays.toString(cats) +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(address, person.address) && gender == person.gender && Arrays.equals(cats, person.cats) && Arrays.equals(cars, person.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, age, address, gender);
        result = 31 * result + Arrays.hashCode(cats);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }


}
