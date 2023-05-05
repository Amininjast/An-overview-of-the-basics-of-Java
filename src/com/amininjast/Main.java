package com.amininjast;

import java.util.Arrays;

public class Main {
    public static String MALE="MALE";
    public static String FEMALE="FEMALE";

    enum Gender{
        Male,Female
    }

    public static void main(String[] args) {
        //old version of switch
//        switch (a){
//            case 'A':
//                System.out.println("Its A");
//                break;
//            case 'B':
//                System.out.println("Its B");
//                break;
//            case 'C':
//            case 'D':
//                System.out.println("Its C or D");
//                break;
//            default:
//                System.out.println("its not A, B, C, D");
//        }

//        switch (a){
//            case 'A'->System.out.println("A");
//            case 'B'->System.out.println("B");
//            case 'C'->System.out.println("C");
//            default -> System.out.println("its not A, B, C, D");
//        }
//
//        String result=switch (a){
//            case 'A'->"A";
//            case 'B'->"B";
//            case 'C'->"C";
//            default -> "its not A, B, C, D";
//        };

//        int boo=switch (b){
//            case 1->1;
//            case 2->2;
//            case 3->3;
//            default -> 0;
//        };
//        System.out.println(boo);
        System.out.println(Main.MALE);
        System.out.println(Main.FEMALE);

        System.out.println();

        System.out.println(Gender.Male);
        System.out.println(Gender.Female);

        System.out.println();

        System.out.println(Color.red);
        System.out.println(Color.valueOf("red"));
        System.out.println(Arrays.toString(Color.values()));

        System.out.println();

        for(Color color:Color.values()){
            System.out.println(color);
        }
    }
//    public static void asa(){
//        var names=new String[]{"amin","mina","hasan"};
//         for(String name:names){
//            if(name.startsWith("m")){
//                break;
//            }
//             System.out.println(name);
//         }
//        System.out.println("in bade return e ");
//    }
}
