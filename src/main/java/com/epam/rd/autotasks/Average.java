package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner (System.in); // объявлен сканнер
        // Use Scanner methods to read input

        int numbers = scanner.nextInt();          // читаем с клавиатуры

        int[] arr = new int[numbers];             // создаем массив int с размером numbers
        int sum = 0;

        for (int i = 0; i < numbers; i++) {         // записываем введенные значения в массив
            int value = scanner.nextInt ();
            arr[i] = value;
        }

        for (int i = 0; i< arr.length; i++){
            sum += arr[i];
        }
            int average = sum / arr.length;
            System.out.println (average);

    }
}