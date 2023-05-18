package com.amininjast;

public class WorkWithException {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1x");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Your String isnt a number :)");
        }

    }
}
