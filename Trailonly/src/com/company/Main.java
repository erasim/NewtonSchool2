package com.company;

public class Main {
    public static void main(String args[]) {
//        Scanner input = new Scanner(System.in);
//        int n= input.nextInt();
        int n = 241;

        superPrimes(n);
        // Your code here
    }

//    public static void prirEM() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = 0;
//        int min = arr[0];
//        int sum = 0;
//        int n2 = n / 2;
//        while (n2 > 0) {
//            for (int i = 0; i < n; i++) {
//                if (arr[i] >= 0) {
//                    if (max < arr[i]) {
//                        max = arr[i];
//                    }
//                    if (min > arr[i]) {
//                        min = arr[i];
//                    }
//                    System.out.println("min= " + min + " max =" + max);
//                    sum = min + max;
//                }
//            }
//
//            System.out.println(sum);
//            n2--;
//        }
//
//    }
        static void SieveOfEratosthenes(int n, boolean[] isPrime){

            isPrime[0] = isPrime[1] = false;
            for (int i=2; i<=n; i++)
                isPrime[i] = true;

            for (int p=2; p*p<=n; p++)
            {
                if (isPrime[p] == true)
                {
                    // Update all multiples of p
                    for (int i=p*2; i<=n; i += p)
                        isPrime[i] = false;
                }
            }
        }
        static void superPrimes(int n)
        {
            boolean isPrime[]=new boolean[n+1];
            SieveOfEratosthenes(n, isPrime);
            int primes[] = new int[n+1];
            int j = 0;
            for (int p=2; p<=n; p++)
                if (isPrime[p])
                    primes[j++] = p;
            for (int k=0; k<j; k++)
                if (isPrime[k+1])
                    System.out.print(primes[j-2]+ " ");

        }
}