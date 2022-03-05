package com.company;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
//        int n, r = 1, num, sum = 0;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number=");
//        n = sc.nextInt();
//        num = n;
//        for (int i = n; i > 0; i--) {
//            if (i%9==1){
//                System.out.println(i);
//                break;
//            }
//        }
        qea2();

    }

    public static void qea2() {
        int n = 53729;
        int n1 = 0;
        int n2 = 0;
        int count = 0;
        String text = " ";
        for (int i = n; i > 0; i--) {
            text = String.valueOf(i);
            // contains both
            if (text.contains("7") && text.contains("9")) {
//                System.out.println(text);

                n1 = Integer.parseInt(text);
                break;
            }
        }
        for (int i = n; i > 0; i++) {

            text = String.valueOf(i);
            // contains both
            if (text.contains("7") && text.contains("9")) {
//                System.out.println(text);
                n2 = Integer.parseInt(text);
                break;
            }
        }
        int s1 = n - n1;
        int s2 = n2 - n;
        if (s1 < s2 && n1 != 0) {
            System.out.print(n1);
        } else {
            System.out.print(n2);
        }

    }
}





