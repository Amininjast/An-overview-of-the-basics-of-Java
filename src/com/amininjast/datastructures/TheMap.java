package com.amininjast.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TheMap {
    public static void main(String[] args) {
        Map<Person, Dimond> map = new HashMap<>();
        map.put(new Person("Amin"), new Dimond("Iraq"));
        map.put(new Person("Amin"), new Dimond("Iran"));
        System.out.println(map.size());
        System.out.println(map.entrySet());

    }

    private static void maps() {
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

    static class Person {
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    record Dimond(String name) {
    }
}

