package com.company;
//import com.sun.org.apache.xpath.internal.objects.XString;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//////        Scanner input = new Scanner(System.in);
//////         int c = input.nextInt();
//////        float F = 9*(float)c/5+32;
//////        System.out.println(F);
//////        char a='a';
//////        char b='A';
//////        int i=(int)a-(int)b;
//////        char c=(char) i;
//////        System.out.print(c);
//////        String name;
//////        int year;
//////        Scanner input= new Scanner(System.in);
//////        name=input.nextLine();
//////        year=input.nextInt();
//////        System.out.println("Hello "+ name);
//////        System.out.println("Free services till: "+ year);
//////********************Find the index in Array**********************************
//////        What will the output of  be, where naturalNumbers is an array defined as
//////        int naturalNumbers[] = {0,1,2,3,4,5,6,7,8,9};
//////        System.out.println("My friend’s age is  "+ naturalNumbers[2] + naturalNumbers[7] +  "years");
////
////
//////********************How to print an array by Scanner input**********************************
//////        int n;
//////        Scanner sc = new Scanner(System.in);
//////        System.out.print("Enter the number of elements you want to store: ");
//////        n = sc.nextInt();
//////        int[] array = new int[10];
//////        System.out.println("Enter the elements of the array: ");
//////        for (int i = 0; i < n; i++) {
//////            array[i] = sc.nextInt();
//////        }
//////        System.out.println("Array elements are: ");
//////        for (int i = 0; i < n; i++) {
//////            System.out.print(array[i] + " ");
////        //********************How to print an array by Scanner input**********************************
//////	// write your code here
//////        int n;
//////        Scanner input = new Scanner(System.in);
//////        n = input.nextInt();
//////        int[] array = new int[10];
//////        for (int i = 0; i < n; i++) {
//////            array[i] = input.nextInt();
//////            System.out.println("print the Element of the array: " + array[i]);
//////        }
//////        for (int i = 0; i < n; i++) {
//////            System.out.println(array[i]);
////
////        //********************How to print an array by Scanner input**********************************
//////        Assume that you have built a lie detector which detects the level of chemicals X and Y.
//////                If the sum of the amounts of X and Y is greater than 30, then the person is telling the truth.
//////        Write Java code to take in the values of X and Y and detect whether the person is telling
//////        the truth or not. If the person is telling the truth, display "The statement said by the person is true".
//////                If the person is lying then display "The statement said by the person is false".
//////        int X, Y;
//////        Scanner input = new Scanner(System.in);
//////        X = input.nextInt();
//////        Y = input.nextInt();
//////
//////        if ((X + Y) >=30 == true){
//////            System.out.println("The statement said by the person is true");
//////
//////        } else{
//////            System.out.println("The statement said by the person is false");
//////        }
////        //********************How to print an array by Scanner input**********************************
////
//////        Assume that you have made some modifications to make the lie detector more sensitive and accurate.
//////
//////        You will be taking chemicals X,Y, A and B as inputs. Also, you will take the heart rate(heartRate) as input.
//////
//////        The person is telling the truth if all the following conditions are met:
//////
//////        Sum of amounts of X and Y is greater than 30
//////        Either A is greater than 3 or B is less than 6
//////        Heart rate is equal to 70
//////        LieMachine();
//////        questionFromUpgrad();
//////        questionIfelse();
//////        System.out.println(gradeSystem());
//////        System.out.println(questionNext());
//////        System.out.println(smalestNumber());
//////        System.out.println(question4());
//////        switchCaseQ1();
//////        ifelsestatement();
//////        caseswith1();
//////        upGradParecticeQ1();
//////        upGradParecticeQ2();
//////        upGradParecticeQ3();
//////        upGradParecticeQ4();
//////        upGradParecticeOfLoopsQ1();
//////        upGradParecticeOfLoopsQ2();
//////        upGradParecticeOfLoopsQ3();
//////        upGradParecticeOfLoopsQ4();
//////        upGradParecticeOfLoopsQ5();
//////        upGradParecticeOfFunctionQ1();
//////        upGradParecticeOfFunctionQ2();
//////        upGradParecticeOfFunctionQ3();
////        upGradParecticeOfLCM();
////        upGradParecticeArraySorting();
//        upGradParecticeFileInput();
        paracticeOfAccioJob();
    }

    //    public static void LieMachine() {
//        int X, Y, A, B, heartRate;
//        Scanner input = new Scanner(System.in);
//        X = input.nextInt();
//        Y = input.nextInt();
//        A = input.nextInt();
//        B = input.nextInt();
//        heartRate = input.nextInt();
//
//        if (((X + Y) > 30) && (A > 3) && (B < 6) && (heartRate == 70)) {
//            System.out.println("The statement said by the person is true");
//
//        } else {
//
//            System.out.println("The statement said by the person is false");
//        }
//        return;
//    }
    //    **************************************************************************
//What will the output of the following code be?
//    int speed1 = 15;
//    double speed2 = speed1*(5/18);
//System.out.println(speed2);
    public static void questionFromUpgrad() {
        int speed1 = 15;
        double speed2 = speed1 * (5 / 18);
        System.out.println(speed2);
        return;

    }

    public static void questionIfelse() {
        int n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();

        if ((n1 < n2) && (n2 < n3)) {
            System.out.println("The numbers entered are in increasing order");
        } else if ((n1 > n2) && (n2 > n3)) {
            System.out.println("The numbers entered are in decreasing order");
        } else {
            System.out.println("The number are in neither in increasing order nor in decreasing order");
        }
        return;

    }

    public static int gradeSystem() {
        int n = 49;
        String name = "Aishwarya";

//          Write a Java program to print a student’s grade based on his marks. You will take the student’s name
//          and marks as input and determine the grade based on the following:
//          Marks | Grade
//                  >100 | A
//                  >80 & <=100 | B
//                  >60 & <=80 | C
//                  >40 & <=60 | D
//                  <=40 | E
        if (n == 100) {
            System.out.println("The grade scored by " + name + " is A");
        } else if ((80 < n) && (n < 100)) {
            System.out.println("The grade scored by " + name + " is B");
        } else if ((60 < n) && (n < 80)) {
            System.out.println("The grade scored by " + name + " is C");
        } else if ((40 < n) && (n < 60)) {
            System.out.println("The grade scored by " + name + " is D");
        } else {
            System.out.println("The grade scored by " + name + " is E");
        }
        return 0;
    }

    //        Lie Detector
//        You will be taking chemicals A,B, X and Y as inputs. Also, you will take the heart rate(heartRate) as input.
//        The person is telling the truth if one of the following conditions are met:
//        Sum of amounts of X and Y is greater than 30
//        Either A is greater than 3 or B is less than 6
//        Heart rate is equal to 70 and X is greater than 3
//
//        The first four lines of input will have A,B,X and Y as inputs in that particular order.
//        The next line of input will have the heart rate.
    public static int questionNext() {

        int X, Y, A, B, HeartRate;
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        X = input.nextInt();
        Y = input.nextInt();
        HeartRate = input.nextInt();


        if ((X + Y) > 30) {
            System.out.println("Truth1");

        } else if (((A > 3) || (B < 6))) {
            System.out.println("Truth2");
        } else if ((HeartRate == 70) && (X > 3)) {
            System.out.println("truth3");
        } else {
            System.out.println("False");
        }
        return 0;


    }

    //    Write Java code to determine the smallest number of three numbers entered by the user.
//    You can take in some numbers as an input, and calculate the smallest of them. After doing that,
//    print out the smallest number as:
//    The smallest number entered is <the smallest calculated number>
    public static double smalestNumber() {
        double n1, n2, n3;
        Scanner input = new Scanner(System.in);
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();


        return Math.min(Math.min(n1, n2), n3);
    }

    public static int question4() {
        int day = 5;
        if (day >= 1 && day <= 5) {
            System.out.print("Time to wake up early. We have work today.");
            if (day == 5) {
                System.out.print("Don't forget to bring snacks for co-workers! ");
            }
        } else if (day == 6 || day == 7) {
            System.out.print("Time to sleep in. No work today.");
        }

        return 0;
    }

    public static void switchCaseQ1() {
        int n = 9;
        switch (n) {
            case 1:
                System.out.println("Prepraing case 1");

                break;
            case 2:
                System.out.println("Prepraing case 2");

                break;
            case 3:
                System.out.println("Prepraing case 3");

                break;
            case 4:
                System.out.println("Prepraing case 4");

                break;
            default:
                System.out.println("Prepraing case defalt");


        }


    }

    public static void ifelsestatement() {
        int n = 4;
        String house;
        if (n == 1) {
            System.out.println("Hufflepuff");
        } else if (n == 2) {
            System.out.println("Gryffindo");
        } else if (n == 3) {
            System.out.println("Slytherin");
        } else if (n == 4) {
            System.out.println("Ravenclaw");
        } else {
            System.out.println("Invalid input");
        }
    }

    public static void caseswith1() {
//        int n;
//        String house;
//        Scanner input = new Scanner(System.in);
//        n = input.nextInt();
//        switch (n) {
//            case 1: {
//                System.out.println("Hufflepuff");
//            }
//            break;
//            case 2: {
//                System.out.println("Gryffindo");
//            }
//            break;
//            case 3: {
//                System.out.println("Ravenclaw");
//            }
//            break;
//            case 4: {
//                System.out.println("Invalid input");
//            }
//            break;
//            default: {
//                System.out.println("invalid input");
//            }
//        }
//        int day = 5;

//        switch(day) {
//
//            case 1:
//                System.out.print("Work Day-Monday");
//                break;
//            case 2:
//                System.out.print("Work Day-Tuesday");
//                break;
//            case 3:
//                System.out.print("Work Day-Wednesday");
//            case 4:
//                System.out.print("Work Day-Thursday");
//                break;
//            case 5:
//                System.out.print("Work Day-Friday");
//                break;
//            default:
//                System.out.print("Yayy-Weekend");
//
//        }
    }

    public static void upGradParecticeQ1() {

//        Q1- Write a Java program to check eligibility to drink based on entered age.(Assume legal drinking age as 21).
//        If the person is eligible, print “You are eligible to consume alcohol”
//        If the person is not eligible, print “You are not eligible to consume alcohol. Go home kid!”
//        Sample Input:
//        21
//        Sample Output:
//        You are eligible to consume alcohol
//        int age;
//        Scanner input = new Scanner(System.in);
//        age = input.nextInt();
//        if (age>=21)
//        {
//            System.out.println("You are eligible to consume alcohol");
//        }
//else {
//            System.out.println("You are not eligible to consume alcohol. Go home kid!");
//        }
//
//    }
    }

    public static void upGradParecticeQ2() {
//        Q2-Write a Java program to take the values of length and breadth from user and print whether
//    the quadrilateral is a rectangle or a square.(You can assume that all angles in the quadrilateral are right angles).
//            1) Print out “Square” in case the quadrilateral is a square
//1) Print out “Rectangle” in case the quadrilateral is a rectangle
//    Sample Input:
//            4
//            4
//    Sample Output:
//    Square
//        int length;
//        int breadth;
//        Scanner input = new Scanner(System.in);
//        length = input.nextInt();
//        breadth = input.nextInt();
//        if (length==breadth){
//            System.out.println("Square");
//        }
//        else {
//            System.out.println("Rectangle");
//        }
//    }

    }

    //    public static void upGradParecticeQ3() {
////        Write Java code for a person to cast a vote against three possible candidates.
////        The code should first check if the person’s age is above or equal to 18 and print
////        “You are not eligible” if the person is less than 18.
////        There are three possible candidates:
////        Ram
////                Shyam
////        Ghanshyam
////        You should take the number as input and display “You have voted for <name>”.
////        The first line of input will contain the person’s age and the second line would contain a
////        number which represents the candidate a person wants to vote for.
////        Sample input
////        18
////        1
////
////        Sample Output
////        You have voted for Ram
//        int age;
//        int vote;
//        Scanner input = new Scanner(System.in);
//        age = input.nextInt();
//        vote =input.nextInt();
//
//        if (age >= 18) {
//            switch (vote) {
//                case 1:
//                    System.out.println("You have voted for Ram");
//                break;
//                case 2:
//                    System.out.println("You have voted for Shyam");
//                    break;
//                case 3:
//                    System.out.println("You have voted for Ghanshyam");
//                default:
//                    System.out.println("invalid input");
//            }
//
//
//        }
//        else {
//            System.out.println("You are not eligible");
//        }
//
//    }
    public static void upGradParecticeQ3() {
//        Now, based on the above logic, write a code that takes the date and month as input and returns the day.
//        You can assume that the given year is a non-leap year and that the 1st of January is a Monday.
//
//        Hint: Convert the given date to the number of days since the start of the year, using the if-else loop logic as shown below.
//
//                IF month.equals(“ January”)
//        dayNumber = inputDay
//        ELSE IF month.equals(“ February”)
//        dayNumber = 31 + day
//        ELSE IF month.equals(“ March”)
//        dayNumber = 31 + 28 + day
//………..
//        Also, if the day is a Saturday or a Sunday, print Hurray!; otherwise, print "Oh! It's a workday :|".
//
//                You can use the following logic to write your codes:
//
//        IF Day is not Saturday or Sunday THEN
//        Display - Ohhh! It's a workday :|
//        ELSE
//        Display - Hurray!
//                ENDIF
//        So, if the input month is 'January' and the input date is 2, then the output is "Ohhh! It's a workday :|".
//
//                If the input month is 'January' and the input date is 6, the output is "Hurray!".

//        Scanner scan = new Scanner(System.in);
//        // Enter month
//        String month = scan.next();
//        // Enter date
//        int date = scan.nextInt();
//
//        int day = 0;
//        switch (month) {
//            case "January":
//                day = date;
//                break;
//            case "February":
//                day = 31 + date;
//
//                // Write the rest of the logic
//
//        }
//
//        // From the day number of the year, finding the day no. of the week
//        int dayNumber = day % 7;
//        // recall, day 1 is Monday
//
//        if (dayNumber==6||dayNumber==0) {
//            System.out.print("Hurray!");
//        } else {
//            System.out.print("Ohhh! It's a work day :|");
//        }
//
//        scan.close();


    }

    public static void upGradParecticeQ4() {
//        {
//            (Comprehension:Income tax
//
//
//            Create a program for calculating the income tax to be paid by an individual earning less than 1
//            crore.Use conditional statements only.
//
//
//            Use the following rules:
//
//            Income range General(non - seniors) Senior citizens ( >= 60 & <80)Very senior citizens( >= 80)
//            Up to 2, 50, 000 Nil Nil Nil
//            Rs. 2, 50, 001 to Rs. 3, 00, 000 10 % Nil Nil
//            Rs. 3, 00, 001 to Rs. 5, 00, 000 10 % 10 % Nil
//            Rs. 5, 00, 001 to Rs. 10, 00, 000 20 % 20 % 20 %
//                Above Rs. 10, 00, 000 30 % 30 % 30 %
//
//
//                Additional information:
//
//        The basic exemption limit for individuals(i.e.below 60years of age) is Rs. 2.50 lakhs.
//                The basic exemption limit for senior citizens (60 years to 80 years)is Rs. 3.00 lakhs.
//
//                The basic exemption limit for very senior citizens(80years and above) is Rs. 5.00 lakhs.
//
//                No extra cess is to be levied.
//
//            Take the income and age as inputs and return the income tax.
//
//            For example, if the income of an individual is 6 lacs and his / her age is <60, then the income tax to
//            be paid is calculated by the following set of rules:
//
//
//            Income range Tax rate
//            Taxable income
//
//            Tax to be paid
//            Income up to Rs. 2, 50, 000 Nil - Nil
//            Income from Rs. 2, 50, 000 –Rs. 5, 00, 000 10 % 0.10 * (500000 - 250000) 25, 000
//            Income from Rs. 5, 00, 000 –Rs. 10, 00, 000 20 %
//                0.2 * (600000 - 500000)
//
//            20, 000
//            Income over Rs. 10, 00, 000 - -0
//            Tax 45, 000
// )}
//        double Income;
//        int age;
//        double tex;
//        double tex2;
//        double tex3;
//        double tex4;
//        Scanner input = new Scanner(System.in);
//        System.out.println("your Income is: ");
//        Income = input.nextInt();
//        System.out.println("your age is: ");
//        age = input.nextInt();
////        for Genral no Senior person
//        if (age < 60 && Income < 250000) {
//            System.out.println("tex paid by you = 0");
//        } else if ((age < 60) && ((Income > 250001) && (Income < 300000))) {
//            tex = (Income - 250000) * 0.1;
//            System.out.println(tex);
//        } else if (age < 60 && ((Income < 500000) && (Income > 300001))) {
//            tex = (Income - 250000) * 0.1;
//            System.out.println(tex);
//        } else if ((age < 60) && ((Income < 1000000) && (Income > 500001))) {
//            tex = (250000 * 0.1) + ((Income - 500000) * 0.2);
//            System.out.println(tex);
//        }
////        For age range 60 to 80
//        else if (((age >= 60) && (age <= 80)) && ((Income < 300000))) {
//            tex = (Income - 250000) * 0.0;
//            System.out.println(tex);
//        } else if (((age >= 60) && (age <= 80)) && ((Income < 300001) && (Income > 500000))) {
//            tex = (Income - 250000) * 0.1;
//            System.out.println(tex);
//        } else if (((age >= 60) && (age <= 80)) && ((Income > 500001) && (Income < 1000000))) {
//            tex = 20000;
//            tex2 = (Income - 500000) * 2 / 100;
//            tex3 = tex + tex2;
//            System.out.println(tex3);
//        }
////        For age range 80 to 100
//        else if ((age > 80) && ((Income > 1) && (Income < 500000))) {
//            tex = (Income - 250000) * 0.0;
//            System.out.println(tex);
//        } else if ((age > 80) && ((Income > 500001) && (Income < 1000000))) {
//            tex = (Income - 500000) * 20 / 100;
//            System.out.println(tex);
//        } else if ((age > 80) && (Income > 1000000)) {
//            tex2 = 500000 * 0.2;
//            tex3 = (Income - 1000000) * 0.3;
//            System.out.println(tex2 + tex3);
//        } else {
//            System.out.println("invalid input");
//        }
//

    }

    public static void upGradParecticeOfLoopsQ1() {
//        Write a code that prints the numbers between 2,000 and 3,000,
//            which are divisible by 8 but not by 6. (Hint: apply Boolean condition - number%8==0 && number%6!=0)
//        Note:
//        Please print all the even numbers on the same line, such as:
//        2000 2008 2024  ...
//        and not on different lines, such as:
//        2000
//        2008
//        2024
//
//
//        for (int i = 2000; i < 3000 ; i++) {
//            if(i%8==0 && i%6>0 ){
//                System.out.println(i);
//            }
//
//        }

    }

    public static void upGradParecticeOfLoopsQ2() {

//        Write a program that prints the sum of first n numbers,
//                where n is the input from the user. For e.g.,
//        if the user input is 10, the output of the program should be 55.
//        int n=10;
//        int sum=0;
//
//        for (int i = 1; i <= n; i++) {
//            sum =sum+i;
//
//        }
//        System.out.println(sum);

    }

    public static void upGradParecticeOfLoopsQ3() {
//        Print first n integers starting from 0 in the reverse order using the for loop.
//        (n is an integer entered by the user)
//        int n =10;
//        while (n>0){
//            System.out.println(n);
//             n--;
//        }

    }

    public static void upGradParecticeOfLoopsQ4() {
//        Take n integers as input and print their average.
//                The input will be in the following format:
//        The first line will contain n which is the number of integers to be taken average of.
//                The next n lines will contain n integers.
//                Average of n numbers= Sum of numbers/n
//
//        Sample Input:
//        2
//        3
//        7
//        Sample Output:
//        5
//        int n1=2;
//        int n2=4;
//        int n3=5;
//        System.out.println((n3+n2)/n1);

//        int i = 10;
//        do {
//            System.out.println(i);
//            i--;
//        }
//        while (i > 0);
    }

    public static void upGradParecticeOfLoopsQ5() {
//        Write a Java program to count the number of digits in a number entered by the user.
//                Hint: You can use the "%" operator here.
//
//        Sample Input:
//        123455
//        Sample Output:
//        6
//        int count = 0, num = 177364746;
//
//        while (num != 0) {
//            // num = num/10
//            num /= 10;
//            ++count;
//        }
//        System.out.println("Number of digits: " + count);

    }

    public static void upGradParecticeOfFunctionQ1() {

//        Write Java code to calculate the HCF or the greatest common divisor of two numbers.
//                Once you've calculated the HCF of two numbers, print out the HCF.
//
//        Hint: HCF is the highest number that divides two numbers. So your loop should start by checking if
//        the lower of the two numbers entered is the HCF and then check the numbers below, one by one until the HCF is found.
//
//                For e.g., if the numbers entered are 12 and 45, the output is 3.
//
//        Sample Input:
//        12 45
//        Output:
//        3
//        int a = 0;
//        int n1 = 78;
//        int n2 = 52;
//        int i;
//        for (i = 2; i <=n1 || i <= n2; i++) {
//            if (n1 % i == 0 && n2 % i == 0) {
//                System.out.println("comman factor of " + n1 + " And " + n2 + "  =" + i);
//               a=i;
//            }
//
//        }
//        System.out.println(a);


    }

    public static void upGradParecticeOfFunctionQ2() {
//        Write a code that prints the highest power of 2, less than or equal to a given number.
//        For e.g., if the input number is 9, the code should print 8, as 8 or  23 is the highest power
//        of two which is less than 9.
//
//        Sample Input:
//        9
//        Output:
//        8
//        int n1 = 9;
//        int i;
//        int hcf = 0;
//        int count = 0;
//        int n =0;
////        for(i = 1; i <= n1 ; i++)
//        for (i = 1; i <= n1; i++) {
////            System.out.println(i);
//            if (i % 2 == 0  ) {
//                System.out.println(i);
//                if((2^n)==i){
//                    System.out.println("ok");
//                }
//                count++;
//                hcf = i;
//            }
//        }
//        System.out.println(hcf);
//        System.out.println(count);
    }

    public static void upGradParecticeOfFunctionQ3() {
//        Write a program that takes two numbers as input and returns the square of their sum.
//        For e.g., if the input numbers - 4 and 9 are passsed as parameters into the function,
//                it should return  169, which is  (4+9)2
//
//        Sample Input:
//        4
//        9
//        Output:
//        169
//        int n1=4; int n2=9;
//        int squre = n1+n2;
//        System.out.println((squre*squre));


    }

    public static void upGradParecticeOfLCM() {
//        int n1 = 12;
//        int n2 = 15;
//        int factor = 0;
//        for (int i = 2; i < n1; i++) {
//
//            if (n1 % i == 0 && n2 % i == 0) {
////                System.out.println(i);
//                factor = i;
//
//            }
//
//        }
//        System.out.println(factor);
//        int lcm = n1 * n2 / factor;
//        System.out.println("LCM = " + lcm);
    }

    public static void upGradParecticeArraySorting() {
//        double[] array = {50.49, 60.43, 71.71, 10.32, 20.36, 30.50, 40.51};
//
//        for (int i = 0; i < array.length; i++) {
//            // Write the round function here.
//
//        }
//
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = Math.round(array[i]);
//
//            Arrays.sort(array);
//
//            System.out.print(array[i] + " ");
//
//        }
    }

    public static void upGradParecticeFileInput() {


    }
//input Fron txt File
//    public static void main(String[] args) throws FileNotFoundException {
////        File inputfile = new File("C:\\Users\\DELL\\Desktop\\number.txt");
////Scanner scan = new Scanner(inputfile);
////int sum = 0;
////int count=0;
////while (scan.hasNext()){
////    int number= scan.nextInt();
////    sum=sum+number;
////    count++;
////
////}
////        System.out.println(sum/count);
//
//
//    }

    public static void paracticeOfAccioJob(){

//        F = C × 9/5 + 32
//For Leap year Calculation
//        Scanner input = new Scanner(System.in);
//        int C=input.nextInt();
//      if(C%400==0){
//          System.out.println("1");
//      }else if (C%100==0){
//          System.out.println("0");
//      }else if (C%4==0) {
//          System.out.println("1");
//      }else {
//          System.out.println("0");
//      }
//        quadrant Question
        int x=-0;
        int y=0;
        Scanner input = new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        if (x>=0 && y>=0) {
            System.out.println("quadrant number-1");

        }
        else if(x<=0 && y>=0){
            System.out.println("quadrant number-2");
        }
        else if (x<=0 && y<=0){
            System.out.println("quadrant number-4");
        }

        else{
            System.out.println("quadrant number-4");
        }
    }



    }















