package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// this can be asked as remove duplicate from the array
public class Distinct_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        printDistinct(arr, n);
        printDist(arr, n);
    }

    public static void printDistinct(int[] arr, int n) {
        //making hashset will store only distinct number
        System.out.println("Using Hashset : ");
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);
        }
        for (int i : hs) {
            System.out.print(i + " ");
        }


    }

    public static void printDist(int[] arr, int n) {
        System.out.println("\n By using Hashmap");
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], i); // i am storing the value into key
        }
//        System.out.println(hm.keySet());
        for (int i : hm.keySet()) {
            System.out.print(i + " ");
        }
    }
}
