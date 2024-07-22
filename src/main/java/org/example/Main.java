package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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
       return true;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        return true;
    }

    public static double area(double width, double height) {
        return 10.0;
    }

    public static double area(double radius) {
       return 10.0;
    }
}
