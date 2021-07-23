package com.company;

import java.util.Scanner;
//input : 1,2,3,4,5
//output : 120,60,40,30,24

public class Array_product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int mul = 1;
        for (int i = 0; i < n; i++) {
            mul = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    mul = mul * arr[j];
                }
            }
            System.out.print(mul + " ");
        }
    }
}
