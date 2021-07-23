package com.company;

import java.util.ArrayList;
import java.util.Scanner;

//sub array of size k with given sum
public class K_length_subarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        checkExistence(arr, n, k, sum);
    }

    private static void checkExistence(int[] arr, int n, int k, int sum) {
        int checkSum = 0;
        int flag = 0;
        //if i want to print that specific subarray also
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < k + i; j++) {
                checkSum += arr[j];
                al.add(arr[j]);
            }
            if (checkSum == sum) {
                flag = 1;
                break;
            } else {
                checkSum = 0;
                al.clear();
            }

        }
        if (flag == 1) {
            System.out.println("YES subarray found ");
            System.out.println("subarray of " + k + " length with given sum(" + sum + ") is : " + al);
        } else {
            System.out.println("NO sub array found ");
        }
    }
}
