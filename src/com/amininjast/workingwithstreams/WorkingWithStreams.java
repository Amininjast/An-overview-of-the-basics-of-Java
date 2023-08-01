package com.amininjast.workingwithstreams;

import com.amininjast.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WorkingWithStreams {
    static List<Person> personList = new ArrayList<>();
    static List<String> names = List.of();

    public static void main(String[] args) throws Exception {
        usingStreams();
    }

    static void usingStreams() throws Exception {
        personList.add(new Person("Amin", 10));
        personList.add(new Person("Nima", 20));
        personList.add(new Person("Reza", 30));
        personList.add(new Person("Akbar", 40));
        personList.add(new Person("Mahmood", 50));
        List<Person> youngPerson = personList.stream()
                .filter(p -> p.getAge() >= 20)
                .limit(3)
                .collect(Collectors.toList());
        youngPerson.forEach(System.out::println);
    }

    void steams() {
        Stream<String> stream = names.stream();

        Stream<String> namesStream = Stream.of("Amin", "Reza", "Nader");
    }
}
