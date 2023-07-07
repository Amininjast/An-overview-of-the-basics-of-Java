package com.amininjast;

import com.amininjast.workwithinterface.Vehicle;

import java.util.Arrays;

public class Person {
    public static int counter;

    private String firstName;
    private String lastName;
    private Address address;
    private String country;

    private Vehicle[] vehicle;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, Vehicle[] vehicle) {
        this.firstName = firstName;
        this.vehicle = vehicle;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Vehicle[] getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle[] vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", country='" + country + '\'' +
                ", vehicle=" + Arrays.toString(vehicle) +
                '}';
    }
}
