package com.raphael.oop.pojo.example_1;

import java.util.Objects;

public class Address {

    private int houseNumber;
    private String streetName;
    private String city;
    private String state;
    private String localGovernmentArea;
    private String country;
    private String landmark;
    private String postalCode;

    public Address(int houseNumber, String streetName, String city, String state, String localGovernmentArea, String country, String landmark, String postalCode) {
        this.houseNumber = houseNumber;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.localGovernmentArea = localGovernmentArea;
        this.country = country;
        this.landmark = landmark;
        this.postalCode = postalCode;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLocalGovernmentArea() {
        return localGovernmentArea;
    }

    public void setLocalGovernmentArea(String localGovernmentArea) {
        this.localGovernmentArea = localGovernmentArea;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber=" + houseNumber +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", localGovernmentArea='" + localGovernmentArea + '\'' +
                ", country='" + country + '\'' +
                ", landmark='" + landmark + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return houseNumber == address.houseNumber && Objects.equals(streetName, address.streetName) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(localGovernmentArea, address.localGovernmentArea) && Objects.equals(country, address.country) && Objects.equals(landmark, address.landmark) && Objects.equals(postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseNumber, streetName, city, state, localGovernmentArea, country, landmark, postalCode);
    }
}
