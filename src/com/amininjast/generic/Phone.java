package com.amininjast.generic;

public class Phone {
    private final String brand;

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + brand + '\'' +
                '}';
    }
}
