package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.*;
import java.util.Scanner;

 import java.util.Locale;

public class Main {

//    static int sum(int a, int b){
//        return a+b;
//    }

    public static void main(String[] args) {
        // Write your code here
//     System.out.println("my name is asim hasnain zaidi");
//        System.out.println("i am from bareilly");


        String name = "asim Hasnain";
        String channel = "Bareilly";
//     System.out.println(name);
//     System.out.println(name.length());
//     System.out.println(name.toUpperCase());
//     System.out.println(name.toLowerCase());
        String name2 = new String(name.toUpperCase());
        String place = new String(channel.toUpperCase());
//     System.out.println(name2 + " from\" " + place);
//     System.out.println(name + " from\\ " + channel);
//     System.out.println(name + " from\t " + channel);
//     System.out.println(name + " from\n " + channel);
//
//        System.out.println(name.contains("s"));
//        System.out.println(name.charAt(7));
//        System.out.println(name.endsWith("s"));
//        System.out.println(name.indexOf("in"));




//        ---------------------------------------------------------------


        int numb1 = 885858, numb2 = 97646464;
//        System.out.println(Math.max(numb1, numb2));
//        System.out.println(Math.min(numb1, numb2));
//        System.out.println(Math.sqrt(36));
//        System.out.println(Math.abs(-36));
//        System.out.println(Math.abs(6));
//        System.out.println(Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+5+(888-666)*Math.random());



//----------------------------------------------------------------------------------


//        int a = 45, x=56, y=67;
//        float b = 45.22f;
//        boolean iAdult = false;
//     System.out.println(x);
//     System.out.println(b);
//     System.out.println(iAdult);


//     ---------------------------------------------------------------------------

//        byte u = -56;
//        double d = 45.635435345d;
//    System.out.println(d);
//        System.out.println(u);
//        char grade = 'A';
//    System.out.println(grade);

    /* Operators in Java

        Operand, operator, Operand  =  Result
        4           +           7   =  11

*/




//        ========================================================


        int num1 = 45, num2=78;
        num1 += 3;
        num2 -= 8;
        // Explore these operators - *=, /=, %=
//        System.out.print("The value of num1 + num2 is ");
//        System.out.println(num1 + num2);
//
//        System.out.print("The value of num1 - num2 is ");
//        System.out.println(num1 - num2);
//
//        System.out.print("The value of num1 * num2 is ");
//        System.out.println(num1 * num2);
//
//        System.out.print("The value of num1 / num2 is ");
//        System.out.println(num1 / num2);
//
//        System.out.print("The value of num1 % num2 is ");
//        System.out.println(num1 % num2);
//
//        System.out.println(num2++);
//        System.out.println(++num1);
//        System.out.println(num1--);
//        System.out.println(--num1);
//



//        ---------------------------------------------------------------------------
        // Taking user input in Java
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Your Age");
//        int age = scan.nextInt();
//        System.out.println(age);
//
////         If-else conditionals
//        if(age<10){
//
//            System.out.println("You are age between 0 t0 10" );
//        }
//        if(age<20) {
//            System.out.println("You are age between 10 t0 20");
//        }
//       if(age<30){
//                System.out.println("You are age between 20 t0 30" );
//       }
//        if(age<40){
//            System.out.println("You are age between 30 t0 40" );
//        }
//        else{
//            System.out.println("You are a kid");
//        }
//

//-----------------------------------------------------------------


////        For Loop
//        for(st1;st2;st3){
//            //Code to be executed
//        }

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Age");
        int a = scan.nextInt();
        System.out.println("Enter the " + a);
        if (a % 2 == 0) {

            for (int i = 0; i <= a; i += 5) {
                System.out.println(i);
            }
            else {
                System.out.println("invalid key");
            }
        }

    }
}