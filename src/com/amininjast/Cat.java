package com.amininjast;

import java.util.Objects;

public class Cat {
    String name;
    String Color;
    int age;


    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, String color) {
        this.name = name;
        Color = color;
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        Color = color;
        this.age = age;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("Amin", "red", 28);
        Cat cat2 = new Cat("Amin", "red", 28);
        System.out.println(cat1.equals(cat2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name) && Objects.equals(Color, cat.Color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Color, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", Color='" + Color + '\'' +
                ", age=" + age +
                '}';
    }
}
