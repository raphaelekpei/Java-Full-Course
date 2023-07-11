package com.raphael.oop.pojo.example_1;

import java.math.BigDecimal;
import java.util.Objects;

public class Car {

    private CarBrand carBrand;
    private BigDecimal price;

    public Car(CarBrand carBrand, BigDecimal price) {
        this.carBrand = carBrand;
        this.price = price;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand=" + carBrand +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return carBrand == car.carBrand && Objects.equals(price, car.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, price);
    }
}
