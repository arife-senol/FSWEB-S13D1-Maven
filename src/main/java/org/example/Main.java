package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    public static void main(String[] args) {

        //System.out.println(shouldWakeUp(true,13));
        //System.out.println(area(9.0));
        System.out.println("Hello world!");

//        System.out.println(isCatPlaying(true, 10));
//        System.out.println(isCatPlaying(false, 36));
//        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if(isBarking && ((clock<8 && clock>=0)||(clock<24 && clock>20))){
        return true;
        }
        else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
       if((firstAge>=13 && firstAge<=19 )||(secondAge>=13 && secondAge<=19 ) || (thirdAge>=13 && thirdAge<=19 )){
           return true;
       }
       else{
           return false;

       }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            if (temp >= 25 && temp <= 45) {
                return true;
            } else {
                return false;
            }
        }
        else {
            if (temp >= 25 && temp <= 35) {
                return true;
            } else {
                return false;
            }
        }

    }

    public static double area(double width, double height) {
        if(width>=0 && height>=0 ){
            return width*height;
        }
        else{
            return -1;
        }
    }

    public static double area(double radius) {
       if(radius>=0){
           return Math.PI*radius*radius;
       }
       else{
           return -1;

       }
    }
}
