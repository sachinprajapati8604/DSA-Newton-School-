package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Array_oddsubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        oddlengthSubarray(arr, n);
    }

    public static void oddlengthSubarray(int arr[], int n) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int key = 0;
        int k = 1;
        for (int i = 0; i < n; i = i + 1) {
//                list.clear();
            for (int j = 0; j < n; j++) {  //0 to n-1

                list.add(arr[j]);
            }
            hm.put(i, list);
//                System.out.println();
        }
        for (int i = 0; i < hm.size(); i++) {
            if (hm.containsKey(i)) {
                ArrayList<Integer> listatIndex = hm.get(i);
                System.out.print(i + "->");
                for (int j = 0; j < listatIndex.size(); j++) {
                    System.out.print(listatIndex.get(j) + " , ");
                }
                System.out.println();
            }
        }
//        System.out.println(hm);
    }
}
