package com.amininjast.workwithinterface;

public class Eskuter implements Vehicle {
    @Override
    public void start() {
        System.out.println("getg on eskuter and turn on");
    }

    @Override
    public void stop() {
        System.out.println("stopping the Eskuter");
    }
}
