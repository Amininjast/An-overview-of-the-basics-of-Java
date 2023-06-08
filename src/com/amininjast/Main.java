package com.amininjast;

import com.amininjast.workwithinterface.Bike;
import com.amininjast.workwithinterface.Car;
import com.amininjast.workwithinterface.Eskuter;
import com.amininjast.workwithinterface.Vehicle;

public class Main {
//    public static java.lang.String MALE = "MALE";
//    public static java.lang.String FEMALE = "FEMALE";
//
//    enum Gender {
//        Male, Female
//    }

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
//        System.out.println(Main.MALE);
//        System.out.println(Main.FEMALE);
//
//        System.out.println();
//
//        System.out.println(Gender.Male);
//        System.out.println(Gender.Female);
//
//        System.out.println();
//
//        System.out.println(Color.red);
//        System.out.println(Color.valueOf("red"));
//        System.out.println(Arrays.toString(Color.values()));
//
//        System.out.println();
//
//        for(Color color:Color.values()){
//            System.out.println(color);
//        }
//    }
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
//        String string = new String();
//        StringClass.stringa();
//
        Car car = new Car();
        Bike bike = new Bike();
        Eskuter eskuter = new Eskuter();

        Vehicle[] vehicles = {car, bike, eskuter};
        Person person = new Person("Amin", vehicles);
        for (Vehicle vehicle : person.getVehicle()) {
            vehicle.start();
            vehicle.stop();
            System.out.println();
        }
        System.out.println(Vehicle.speed);
        System.out.println(car.kiloToMile(100));

    }
}
