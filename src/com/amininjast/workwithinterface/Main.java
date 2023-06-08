package com.amininjast.workwithinterface;

import com.amininjast.Person;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Eskuter eskuter = new Eskuter();

        Vehicle[] vehicles = {car, bike, eskuter};
        Person person = new Person("Amin", vehicles);
        for (Vehicle vehicle : person.getVehicle()) {
            vehicle.start();
            vehicle.stop();
            System.out.println();
        }
        System.out.println(Vehicle.speed);
        System.out.println(car.kiloToMile(100));
    }
}
