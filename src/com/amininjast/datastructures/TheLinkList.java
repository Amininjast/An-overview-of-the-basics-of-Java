package com.amininjast.datastructures;

import com.amininjast.Person;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkList {
    public static void main(String[] args) {
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("Amin"));
        linkedList.add(new Person("Reza"));
        linkedList.add(new Person("mahmod"));

        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()) {
            System.out.println(personListIterator.next());
        }
        System.out.println();

        while (personListIterator.hasPrevious()) {
            System.out.println(personListIterator.previous());
        }
    }
}
