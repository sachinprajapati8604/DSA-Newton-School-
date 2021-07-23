package com.company;

import java.util.Scanner;

public class count_pair_difference_sum0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //5
        int k = sc.nextInt();  //3
        int arr[] = new int[n];  // 1 5 3 4 2
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff == k) {
                    System.out.println(arr[i] + " " + arr[j]); //print  the pair
                    count++;
                }
            }
        }

        System.out.println("Total pairs : " + count);
    }
}
