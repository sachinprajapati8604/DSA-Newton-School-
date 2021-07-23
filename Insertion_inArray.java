package com.company;

import java.util.Scanner;

public class Insertion_inArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int newElement = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        InsertAtBegining(arr, n, newElement);
        System.out.println();
        InsertAtLast(arr, n, newElement);


    }

    private static void InsertAtBegining(int[] arr, int n, int num) {
        int[] newarr = new int[n + 1];
        newarr[0] = num;
        for (int i = 0; i < n; i++) {
            newarr[i + 1] = arr[i];
        }
        System.out.println("After inserting at begining : ");
        // just making a foreach loop
        for (int i : newarr) {
            System.out.print(i + " ");
        }
    }

    private static void InsertAtLast(int arr[], int n, int num) {
        int[] newarr = new int[n + 1];
        newarr[n] = num;
        for (int i = 0; i < n; i++) {
            newarr[i] = arr[i];
        }
        System.out.println("After inserting element at last : ");
        for (int i = 0; i < n + 1; i++) {
            System.out.print(newarr[i] + " ");
        }
    }


}
