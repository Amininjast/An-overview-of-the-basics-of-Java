package com.amininjast.bound;

public class BoundedTypeParameters {
    public static void main(String[] args) {
        int number = 2;
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(countGreaterThan(numbers, number));
    }

    public static int countGreaterThan(int[] numbers, int number) {
        int count = 0;
        for (int a : numbers) {
            if (a > number) {
                count++;
            }
        }
        return count;
    }
}
