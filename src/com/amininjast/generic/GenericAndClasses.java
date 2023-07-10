package com.amininjast.generic;

public class GenericAndClasses {
    public static void main(String[] args) {
        String[] names = {"Amin", "Reza"};
        Character[] letters = {'a', 'b', 'c'};
        Integer[] numbers = {1, 2, 3, 4, 5, 6};

        print(names);
        print(letters);
        print(numbers);

    }

    private static void extracted() {
        Box<Phone> box1 = new Box<>();
        Box<Letter> box2 = new Box<>();

        box1.setT(new Phone("Amin"));
        System.out.println(box1);
        box2.setT(new Letter("Reza"));
        System.out.println(box2);
    }

    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(e.getClass() + " - " + e);
        }
    }
}
