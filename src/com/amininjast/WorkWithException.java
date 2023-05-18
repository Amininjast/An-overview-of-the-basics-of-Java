package com.amininjast;

public class WorkWithException {
    public static void main(String[] args) {
//        try {
//            int number = Integer.parseInt("1");
//            System.out.println(number);
//            int number2 = 10 / 0;
//            System.out.println(number2);
//        } catch (NumberFormatException | ArithmeticException e) {
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            System.out.println("All Exception");
//            System.out.println(e.getMessage());
//        } finally {
//            System.out.println("Finally always run");
//        }
        System.out.println(divide(10, 1));
        System.out.println(divide2(10, 3));
        try {
            System.out.println(divide3(10, 0));
        } catch (MyCheckException e) {
            e.printStackTrace();
        }
    }

    public static double divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static double divide2(int a, int b) throws MyUncheckException {
        if (b == 0) {
            throw new MyUncheckException("Cannot divide by zero");
        }
        return a / b;
    }

    public static double divide3(int a, int b) throws MyCheckException {
        if (b == 0) {
            throw new MyCheckException("Cannot divide by zero");
        }
        return a / b;
    }
}
