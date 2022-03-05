package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        newtowArena2Q7();
//        System.out.println(Race(1, 2, 3));
//        System.out.println(diceProblem(2));
//        System.out.println(distributingMoney(1, 3, 4, 1));
//        newtowArena3Q1();
        isLeapYear();
    }

    public static void newtonAssigement3Q1() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        long b = input.nextLong();
        float c = input.nextFloat();
        double d = input.nextDouble();
        char e = input.next().charAt(0);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

    }

    public static void newtonAssigement3Q2() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int sum = a + b + c;
        System.out.println(sum);
    }

    public static void newtonAssigement3Q3() {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        System.out.println(a);
    }

    public static void newtonAssigement3Q4() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println(a);
    }

    public static void newtonAssigement3Q5() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = input.nextInt();
        int profit = c - a;
        System.out.println(profit);
    }

    public static void newtonAssigement3Q6() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if (b != 0) {
            int c = a / b;
            System.out.println(c);

        } else {
            System.out.println("-1");
        }

    }

    public static void newtonAssigement3Q7() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = input.nextInt();
        int x = a * c;
        System.out.println(x);

    }

    public static void newtonAssigement4Q1() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = input.nextInt();
        --a;
        c++;
        System.out.println(a + " " + c);

    }

    public static void newtonAssigement4Q2() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int x1 = (a + 8) / 3;
        int x2 = x1 % 5;
        int x3 = x2 * 5;
        System.out.println(x3);
    }

    public static void newtonAssigement4Q3() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int x = 0;
        int cal1 = (x + a) * 2;
        int cal2 = cal1 + b;
        int cal3 = cal2 / 2;
        int cal4 = cal3 - x;
        System.out.println(cal4);
    }

    public static void newtowArenaQ1() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int area = a * a;
        System.out.println(area);


    }

    public static void newtowArenaQ2() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int result = (a - 32) * 5 / 9;
        System.out.println(result);
    }

    public static void newtowArenaQ3() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);


    }

    public static void newtowArena2Q1() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a % 2 == 0) {
            System.out.println(0);
        } else System.out.println(1);
    }

    public static void newtowArena2Q2() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        switch (a) {
            case 1: {
                System.out.println("one");
                break;
            }
            case 2: {
                System.out.println("two");
                break;
            }
            case 3: {
                System.out.println("three");
                break;
            }
            case 4: {
                System.out.println("four");
                break;
            }

            default: {
                System.out.println("greater than five");
            }
        }
    }

    public static void newtowArena2Q3() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz" + " ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz" + " ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz" + " ");
            } else {
                System.out.print(i + " ");
            }

        }
    }

    public static void newtowArena2Q4() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n % 4 == 0) {

            // if the year is century
            if (n % 100 == 0) {

                // if year is divided by 400
                // then it is a leap year
                if (n % 400 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

            // if the year is not century
            else
                System.out.println("YES");
        } else
            System.out.println("NO");

    }

    public static void newtowArena2Q5() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int max = 0;
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }

    public static void newtowArena2Q6() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int timeA = c / a;
        int timeB = c / b;
        if (timeA > timeB) {
            System.out.println("S");
        } else if (timeB > timeA) {
            System.out.println("N");
        } else {
            System.out.println("D");
        }

    }

    //    Distance = 5-2 = 3, Speed = 3
//    Time = Distance/Speed
    public static void newtowArena2Q7() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = a - b;
        int timeA = d / c;


        System.out.println(timeA);
    }

    static char Race(int a, int b, int c) {
//Enter your code here
        char re = 'D';
        int d1 = Math.abs(c - a);
        int d2 = Math.abs(c - b);
        if (d1 > d2) {
            re = 'S';
        } else if (d2 > d1) {
            re = 'N';
        } else {
            re = 'D';
        }
        return re;
    }

    static int diceProblem(int N) {
        int opposideSide = 7 - N;

        return opposideSide;
    }

    public static void newtowArena4Q2() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int avg = 0;
        avg = (a + b + c) / 2;
        System.out.println(avg);

    }

    public static int distributingMoney(long x, long y, long z, long K) {
        //Enter your code here
        long max = 0L;
        long min = 0L;
        long total = x + y + K + z;
        if (x > y && x > z) {
            max = x;
        } else if (y > x && y > z) {
            max = y;
        } else {
            max = z;
        }
        if (x < y && x < z) {
            min = x;
        } else if (y < x && y < z) {
            min = y;
        } else {
            min = z;
        }
        long dif = max - min;
        if (dif <= K && total % 3 == 0) {
            return 1;
        }
        return 0;
    }

    public static void newtowArena3Q1() {
        Scanner s = new Scanner(System.in);
        System.out.println("How many values ?");
        int nbInput = s.nextInt();
        for (int i = 1; i <= nbInput; i++) {
            int input = s.nextInt();
            System.out.print(input);
        }
    }

    public static void isLeapYear() {
Scanner input=new Scanner(System.in);
       int year = input.nextInt();
        if (year % 4 == 0) {

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
    public static void assiment4Q2() {
        Scanner input=new Scanner(System.in);
        int s1 = input.nextInt();
        int  s2= input.nextInt();
        int s3 = input.nextInt();
        int s4 = input.nextInt();
        int s5= input.nextInt();
        int marks=(s1+s2+s3+s4+s5)/5;
        if (marks >= 80 ){
            System.out.println("A");
        } else if (marks<80 && marks >=60  ){
            System.out.println("B");
        }
        else if (marks<60 && marks >=40 ){
            System.out.println("C");
        }
        else {
            System.out.println("D");
        }

    }
    static int Charity(int N, int M){
//Enter your code here
        int s=M/N;
        if (s>1){return s;}
        return -1;
    }
    static int Knight(int X, int Y){
//Ener your code here
    if(x == 1)
    }
}


