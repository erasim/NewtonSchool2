package com.company;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {

        System.out.println("hello bhai");

    }


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




}