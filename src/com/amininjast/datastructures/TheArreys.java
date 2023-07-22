package com.amininjast.datastructures;

import java.util.ArrayList;
import java.util.List;

public class TheArreys {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        integerList.add(11);
        System.out.println(list);
        System.out.println(integerList);


    }
}
