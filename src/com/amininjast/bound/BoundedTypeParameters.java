package com.amininjast.bound;

public class BoundedTypeParameters {
    public static void main(String[] args) {
        Integer number = 2;
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println(countGreaterThan(numbers, number));
        Double number2 = 3.1;
        Double[] numbers2 = {1.2, 2.2, 3.1, 3.2, 3.3, 4.2, 5.3};
        System.out.println(countGreaterThan(numbers2, number2));
    }

    static <T extends Comparable> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T a : numbers) {
            if (a.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
