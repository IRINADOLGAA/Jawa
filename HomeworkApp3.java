package ru.geekbrains.lesson3;

import java.util.Scanner;

public class HomeworkApp3 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args) {
            System.out.println(enterNumber("Enter value a >", "Enter value b >", "Result > "));
            invertArray(); // task 1
            fillArray();  // task 2
            changeArray(); // task 3
            fillDiagonal(); // task 4
            createArray(10, 35); // task 5
            printArray(createArray(10, 35)); // task 5
            minAndMaxElementsArray(); // task 6

    }



      // Дополние к ДЗ
        public static int enterNumber (String systemMessage1, String systemMessage2, String resultMessage) {
            System.out.println(systemMessage1);
            int a = scanner.nextInt();
            System.out.println(systemMessage2);
            int b = scanner.nextInt();
            System.out.print(resultMessage);
            return a + b;
        }

        // task 1
        public static void invertArray () {
            int [] arr = {0, 0, 0, 1, 1, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    arr[i] = 1;
                }   else {
                    arr [i] = 0;
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        // task 2
        public static void fillArray () {
            int [] arr = new int [100];
            int counter = 1;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = counter;
                System.out.print(arr[i] + "|");
                counter++;
            }
            System.out.println();
        }

        // task 3
        public static void changeArray () {
            int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6) {
                    arr[i] *= 2;
                }
                System.out.print(arr[i] + " | ");
            }
            System.out.println();
        }

        // task 4
        public static void fillDiagonal () {
            int[][] arr = new int[4][4];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (i == j || (i + j) == 3) {
                        arr[i][j] = 1;
                    }
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
        }

        // task 5
        public static int[] createArray (int len, int initialValue) {
            int [] arr = new int [4];
            for (int i = 0; i < arr.length; i++) {
                arr [i] = initialValue;
            }
            return arr;
        }
        public static void printArray (int [] arr) {
            for (int i = 0; i < arr.length; i++) {
              System.out.print(arr[i] + " | ");
            }
            System.out.println();
        }

        // task 6
        public static void minAndMaxElementsArray (){
            int[] arr = {1, 25, 3, 5, 55};
            int max = arr[0];
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                } else if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.print(min + " " + max);

        }










}

