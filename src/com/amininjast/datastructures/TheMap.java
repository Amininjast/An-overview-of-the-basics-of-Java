package com.amininjast.datastructures;

import java.util.HashMap;
import java.util.Map;

public class TheMap {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Amin"));
        map.put(2, new Person("Ali"));
        map.put(3, new Person("hamid"));

        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println(map.values());

        map.remove(2);
        System.out.println(map.entrySet());
    }

    record Person(String name) {
    }
}

