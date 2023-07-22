package com.amininjast;

import java.io.Serializable;

public class JavaBean implements Serializable {
    private String name;
    private String color;
    private int number;

    public JavaBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
