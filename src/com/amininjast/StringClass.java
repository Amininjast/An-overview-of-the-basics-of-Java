package com.amininjast;

public class StringClass {
    public static void stringa() {
        String number = "20";
        String[] names = {"Amin", "hamid", "ahmad"};
        String s = String.valueOf(12366);
        System.out.println(s);

        String format = String.format("number is %s", number);
        System.out.println(format);

        String join = String.join("+", names);
        System.out.println(join);

    }
}
