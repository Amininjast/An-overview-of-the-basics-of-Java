package com.amininjast.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueue {
    public static void main(String[] args) {
        Queue<person> supermarket = new LinkedList<>();
        supermarket.add(new person("Amin", 28));
        supermarket.add(new person("Ali", 24));
        supermarket.add(new person("Reza", 23));

        System.out.println("the queue size is : " + supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.poll());
        System.out.println("the queue size is : " + supermarket.size());
    }

    static record person(String name, int age) {
    }
}
