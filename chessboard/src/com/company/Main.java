package com.company;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
//        newtonArena3Q1();
//        vertical5();
        pattern();
    }

    public static void newtowArena2Q7() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int s = input.nextInt();
        int bigger = 0;
        int lower = 0;
        if (a >= b) {
            bigger = a;
            //    System.out.println();
        } else {
            bigger = b;
            //    System.out.println();
        }
        if (a <= b) {
            lower = a;
            //    System.out.println();
        } else {
            lower = b;
            //    System.out.println();
        }


        int distance = bigger - lower;
        int timeA = distance / s;

        System.out.println(timeA);
    }

    public static void newtonArena3Q1() {
        int n = 0;
        int opposide = 0;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a = input.nextInt();
            opposide = 7 - a;
            System.out.println(opposide);
        }

    }

    static void pattern() {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        int D = input.nextInt();
        for (int i = 1; i <= n; i++) {
            int rem=i%10;
          if (rem%D==0){
              System.out.println(i);
          }
            }

        }
    }






