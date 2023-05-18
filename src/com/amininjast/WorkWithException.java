package com.amininjast;

public class WorkWithException {
    public static void main(String[] args) {
        try {
            int number = Integer.parseInt("1");
            System.out.println(number);
            int number2 = 10 / 0;
            System.out.println(number2);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("All Exception");
            System.out.println(e.getMessage());
        }

    }
}
