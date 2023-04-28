package com.amininjast;

public class Main {

    public static void main(String[] args) {
        System.out.println("Amin Injast");
        char a = 'A';
        //old version of switch
        switch (a){
            case 'A':
                System.out.println("Its A");
                break;
            case 'B':
                System.out.println("Its B");
                break;
            case 'C':
            case 'D':
                System.out.println("Its C or D");
                break;
        }
    }
}
