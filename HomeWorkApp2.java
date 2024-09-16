package ru.geekbrains.lesson2;

public class HomeWorkApp2 {
    public static void main (String [] args) {
        System.out.println(withing10and20(15, 5)); // taskNumber1
        positiveOrNegativeNumber(-52); // taskNumber2
        System.out.println(negativeNumber(-33)); // taskNumber3
        printWordTimes ("Hello", 5); // taskNumber4
        System.out.println (leapYear (100)); // taskNumber5
    }
    // taskNumber1
    public static boolean withing10and20 (int a, int b) {
        if (a + b >= 10 && a + b <=20) {
            return true;
        } else {
            return false;
        }
    }

    // taskNumber2
    public static void positiveOrNegativeNumber (int x) {
        if (x >= 0) {
            System.out.println(x + " " + " - положительно число");
        } else {
            System.out.println(x + " " + "- отрицательное число");
        }
    }

    // taskNumber3
    public static boolean negativeNumber (int x) {
        if (x <= 0) {
            return true;
        } else {
            return false;
        }
    }

    // taskNumber4
    public static void printWordTimes (String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(name);
        }
    }

    // taskNumber5
    public static boolean leapYear (int x) {
        if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0) {
            return true;
        }  else {
            return false;
        }
    }
}
