package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Mera Programme Chal gaya yahooooooo");

//        int[] arr = {0, 1, 0, 1, 0, 1, 1};
//        sort01(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + ",");
//            System.out.println(reverseANumber(987654));
//        }

//        System.out.println(isPrimeOptimized(198756145));

//        System.out.println(divisors(n: 49));
//        System.out.println(divisors(383838));
        System.out.println(reverseANumber(77487));
    }


//    ----------------------start of code---------------------------?

    public static void sort01(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

public static boolean isPrimeOptimized(int n){
        int sqrt = (int) Math.sqrt(n);
        for(int i=2;i<=sqrt; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
}

public static int divisors(int n){

        int count =2;
       int sqrt = (int) Math.sqrt(n);
       for (int i = 2; i <= sqrt; i++){
           if (n % i==0){
               count++;
               if(n/i !=i) {
                   count++;
               }

           }
       }
       return count;
}

    public static int reverseANumber(int n) {
        int res = 0;
        while (n > 0) {
            int last = n % 10;
            res = res * 10 + last;
            n = n / 10;
        }
        return res;
    }



//    --------------------------End of Code--------------------------?
}