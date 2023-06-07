package com.amininjast.workwithinterface;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Starting engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the car");
    }
}
