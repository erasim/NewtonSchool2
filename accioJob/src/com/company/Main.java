package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


//        moduleTrangle();
//        Palindrome();
//        Armstrong();
//        staircase();
//        int[] arr = { 2, -1, 5, 6, 0, -3 };
//        arrayElementCount();
//        myArray();
//        myArrayQ2();
//        myArrayQ3();
//        myArrayQ4();
//        int n = 3;
//        int arr[][] =
//                {
//                        {11, 2, 4},
//                        {4, 5, 6},
//                        {10, 8, -12}
//                };
//        System.out.println(module7Q1());
//        System.out.println(module7Q2());
//        module7Q3();
//        module7Q4();
        module7Q5();
        // write your code here
    }

    public static void moduleTrangle() {
        int a = 0;
        int b = 0;
        int c = 0;
        int largeSide = 0;
        Scanner Input = new Scanner(System.in);
        a = Input.nextInt();
        b = Input.nextInt();
        c = Input.nextInt();
//        System.out.println(a + b + c);
        if (a > b && a > c) {
            largeSide = a;
//            System.out.println("Lagest side is " + largeSide);
        } else if (b > a && b > c) {
            largeSide = b;
//            System.out.println("Lagest side is " + largeSide);
        } else {
            largeSide = c;
//            System.out.println("Lagest side is " + largeSide);
        }
        if ((2 * largeSide * largeSide) < ((a * a) + (b * b) + (c * c))) {
//            System.out.println("this is acute-angled");
            System.out.println("1");
        } else if ((2 * largeSide * largeSide) > ((a * a) + (b * b) + (c * c))) {
//            System.out.println("this is obtuse-angled");
            System.out.println("3");
        } else if ((2 * largeSide * largeSide) == ((a * a) + (b * b) + (c * c))) {
//            System.out.println("this is right-angled");
            System.out.println("2");
        }


    }

    public static void Palindrome() {
        int r, sum = 0, temp;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        temp = n;
        while (n > 0) {
            r = n % 10;  //getting remainder
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }

    public static void Armstrong() {
        int sum = 0;
        int sum1 = 0;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n2 = n;
        while (n > 0) {
            int r = n % 10;  //getting remainder
//            System.out.println(r);
//            System.out.println(r*r*r);
            sum = (r * r * r);
//            sum=sum+(r*r*r);
//            System.out.println(r^3);
            sum1 = sum1 + sum;
            n = n / 10;
        }
        System.out.println(sum1);
        if (n2 == sum1) {
            System.out.println("Armstrong number " + sum1);
        } else {
            System.out.println("Not an Armstrong number ");
        }

    }

    public static void staircase() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();


        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = n - i; k < n; k++) {
                System.out.print("#");
            }
            System.out.println("");
        }
    }

    public static void arrayElementCount(int[] arr) {
        int len = arr.length;
        float positiveCount = 0;
        float negativeCount = 0;
        float zeroCount = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else if (arr[i] == 0) {
                zeroCount++;
            }

        }
    }

    public static void myArray() {
        int positiveNum = 0;
        int NegativeNum = 0;
        int zeroNum = 0;

        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int arr[] = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }
//        int arr[] = {-65, -34, 0, 23, 54, 7};
//        int len = arr.length;
//        System.out.println("New Array is");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
//                System.out.print(arr[i]);
                NegativeNum++;
            }
            if (arr[i] > 0) {
//                System.out.println(arr[i]);
                positiveNum++;
            }
            if (arr[i] == 0) {
//                System.out.println(arr[i]);
                zeroNum++;
            }

        }
//        System.out.println("positive Number = " + positiveNum);
//        System.out.println("negative Number = " + NegativeNum);
//        System.out.println("zero Number = " + zeroNum);
        double positve = (double) positiveNum / len;
        double negative = (double) NegativeNum / len;
        double zero = (double) zeroNum / len;
        System.out.println(positve);
        System.out.println(negative);
        System.out.println(zero);
    }

    public static void myArrayQ2() {
        int count = 0;
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i] - arr[j] == K || arr[j] - arr[i] == K) {
                    count++;

                }

            }
        }

        System.out.println(count / 2);

    }

    public static void myArrayQ3() {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] > 0 && arr[i] >= arr[K - 1]) {
                ans++;
            }

        }
        System.out.println(ans);
    }

    public static void myArrayQ4() {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = input.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i] > arr[j] && (arr[i] + arr[j]) % K == 0) {
                    ans++;
//                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        System.out.println(ans);
    }

    public static void myArrayQ5() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int q = input.nextInt();
        int arr[] = new int[n];
        int rotatedArray[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            rotatedArray[newIndex] = arr[i];
        }
        for (int i = 0; i < q; i++) {
            int index = input.nextInt();
            System.out.println(rotatedArray[index]);

        }
    }

    public static int module7Q1() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {


                arr[i][j] = input.nextInt();
            }
        }
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // finding sum of primary diagonal
                if (i == j) {
                    d1 += arr[i][j];
                }

                // finding sum of secondary diagonal
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);
    }

    public static int module7Q2() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int[] freq = new int[101];
        int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
            if (maxFreq < freq[arr[i]]) {
                maxFreq = freq[arr[i]];
            }
        }
        return n - maxFreq;
    }

    public static void module7Q3() {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int count = 0;
            int n = input.nextInt();
            int k = input.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = input.nextInt();
                if (arr[j] <= 0) {
                    count++;

                }

            }
            if (count < k) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    public static void module7Q4() {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int n = input.nextInt();
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j]==1){
                    for (int k = 0; k < n; k++) {
                        mat[i][k]=1;


                    }
                }

            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+" ");

            }
            System.out.println();

        }
    }
    public static void module7Q5(){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = input.nextInt();
            }
        }
        long blacksum=0;
        long whitesum=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i+j)%2==0){
                    blacksum=blacksum+mat[i][j];
                }else{
                    whitesum=whitesum+mat[i][j];
                }

            }

        }
        System.out.println(blacksum);
        System.out.println(whitesum);
    }
}







