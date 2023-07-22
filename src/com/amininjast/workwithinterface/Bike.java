package com.amininjast.workwithinterface;

public class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Pedal");
    }

    @Override
    public void stop() {
        System.out.println("break");
    }
}
