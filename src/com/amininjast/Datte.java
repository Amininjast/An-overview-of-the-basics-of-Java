package com.amininjast;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;

public class Datte {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("now :" + now);
        System.out.println("getMonth:" + now.getMonth());
        System.out.println("DayOfMonth:" + now.getDayOfMonth());
        System.out.println("DayOfWeek:" + now.getDayOfWeek());
        System.out.println("Hour" + now.getHour());
        System.out.println("Minute" + now.getMinute());
        System.out.println("Second" + now.getSecond());
        System.out.println("minusDays 5:" + now.minusDays(5));

    }
}
