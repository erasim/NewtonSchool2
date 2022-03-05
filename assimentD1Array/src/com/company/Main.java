package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 4, 5};
        int n = arr.length;
        arrayQ4(arr, n);

    }

    public static void arrayQ1() {
        int a1 = 0;
        int a2 = 0;
        int sum = 0;
        int n = 0;
//        int[] array = {2, 5, 4, 5, 6, 7, 8, 9};
//        a = array.length;
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = input.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
            if (array[i] > a1) {
                a1 = array[i];
                n = 0;
            } else {
                n = a1 - array[i];
            }
            System.out.print(n + " ");
            sum = sum + array[i] + n;
        }
        System.out.println();
        System.out.println(sum);
    }

    public static void arrayQ2() {
        int i, j, row = 6;
//outer loop for rows
        for (i = 0; i < row; i++) {
            System.out.print("*");
//inner loop for columns
            for (j = 0; j <= i - 1; j++) {
//prints stars

                System.out.print("^");
            }
//throws the cursor in a new line after printing each line
            if (i != 0) {
                System.out.println("*");
            } else {
                System.out.println();

            }
        }
        for (int k = 0; k < row; k++) {
            System.out.print("*");

        }
    }

    public static void arrayQ3(int[] arr, int n) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }

    public static void arrayQ4(int arr[], int arr_size) {

    /* There should be
    atleast three elements */
        if (arr_size < 3) {
            System.out.printf(" Invalid Input ");
            return;
        }

        // Find first
        // largest element
        int first = arr[0];
        for (int i = 1;
             i < arr_size; i++)
            if (arr[i] > first)
                first = arr[i];

        // Find second
        // largest element
        int second = Integer.MIN_VALUE;
        for (int i = 0;
             i < arr_size; i++)
            if (arr[i] > second &&
                    arr[i] < first)
                second = arr[i];

        // Find third
        // largest element
        int third = Integer.MIN_VALUE;
        for (int i = 0;
             i < arr_size; i++)

            if (arr[i] > third &&
                    arr[i] < second)
                third = arr[i];


        System.out.print(first + " ");
        System.out.print(second + " ");
        System.out.print(third + " ");

    }
}


