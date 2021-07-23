package com.company;

import java.util.Scanner;

public class K_length_subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print_subarray(arr, n, k);
    }

    private static void print_subarray(int[] arr, int n, int k) {
        System.out.println("Printing subarray of " + k + " length  : ");
        for (int i = 0; i <= n - k; i++) {
            for (int j = i; j < k + i; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();
        }
    }


}
