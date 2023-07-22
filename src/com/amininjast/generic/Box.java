package com.amininjast.generic;

public class Box<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }
}
