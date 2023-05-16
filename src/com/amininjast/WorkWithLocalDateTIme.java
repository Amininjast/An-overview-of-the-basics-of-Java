package com.amininjast;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class WorkWithLocalDateTIme {
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

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());


        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println("****************************");
        LocalDateTime localDateTime = LocalDateTime.of(1995, Month.FEBRUARY, 28, 12, 00);
        System.out.println(localDateTime);
        System.out.println("****************************");
        LocalDate someLocalDate = LocalDate.of(1995, Month.FEBRUARY, 28);
        System.out.println(someLocalDate);
        System.out.println("****************************");
        LocalTime someLocalTime = LocalTime.of(23, 55, 0);
        System.out.println(someLocalTime);
    }
}
