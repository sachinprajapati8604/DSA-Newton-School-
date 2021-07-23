package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = FindDuplicate(arr, n);
        if (res == -1) {
            System.out.println("There is no such duplicate element in the given array");
        } else {
            System.out.println("Duplicate element is : " + res);
        }
        System.out.println("IN O(n) : " + getDuplicate(arr, n));
        MultipleDuplicates(arr, n);
        printRepeat(arr, n);
    }

    // Time comlexity to search duplicate entry here is O(n^2) using simple linear search
    public static int FindDuplicate(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    //we can do this in O(n) by using sort to array
    private static int getDuplicate(int arr[], int n) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return arr[i];
            }
        }
        return -1;
    }

    // Time complexity is still here O(n^2)
    public static void MultipleDuplicates(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }

    // now this approach handle in O(n)
    private static void printRepeat(int[] arr, int n) {
        System.out.println("\n Repeating elements are : ");
        for (int i = 0; i < n; i++) {
            int abs = Math.abs(arr[i]);
            if (arr[abs] >= 0) {
                arr[abs] = -arr[abs];
            } else {
                System.out.print(abs + " ");
            }
        }

    }
}
