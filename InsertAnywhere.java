package com.company;

import java.util.Scanner;

public class InsertAnywhere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int index = sc.nextInt();
        int element = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        InsertAnywhere(arr, size, index, element);

    }

    public static void InsertAnywhere(int[] arr, int n, int index, int num) {
        int modifiedArr[] = new int[n + 1];
        modifiedArr[index] = num;
        for (int i = 0; i < n; i++) {
            if (i < index) {
                modifiedArr[i] = arr[i];
            } else {
                modifiedArr[i + 1] = arr[i];
            }
        }

        for (int i : modifiedArr) {
            System.out.print(i + " ");
        }
    }
}
