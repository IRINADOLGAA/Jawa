package ru.geekbrains.lesson1;

public class HomeWorkApp {
      public static void main (String[] args) {
            printThreeWords ();
            checkSumSign ();
            printColor ();
            compareNumber ();

      }

            public static void printThreeWords () {
                  System.out.println("Orange");
                  System.out.println("Banana");
                  System.out.println("Apple");
            }
            public static void checkSumSign () {
                  // объявляем и инициализируем две переменные а и b
                  int a = -300, b = -120;
                  if ((a+b) >= 0) {
                        System.out.println("Cумма положительная");
                  } else {
                        System.out.println("Cумма отрицательная");
                  }
            }

            public static void printColor () {
                  // объявляем и инициализируем переменную value
                  int value = 1000;
                  if (value <= 0) {
                        System.out.println("Красный");
                  } else if (value>0 && value<=100) {
                        System.out.println("Желтый");
                  } else if (value>100) {
                        System.out.println("Зеленый");
                  }
            }

            public static void compareNumber () {
                  // объявляем и инициализируем две переменные a и b
                  int a = 1, b = 1000;
                  if (a >= b) {
                        System.out.println("a>=b");
                  }
                        System.out.println("a<b");
            }
}






