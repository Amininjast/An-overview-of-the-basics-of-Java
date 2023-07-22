package com.amininjast.workwithinterface;

public interface Vehicle {
    double speed = 10;

    void start();

    void stop();

    default double kiloToMile(int speed) {
        return speed * 1.609;
    }

}
