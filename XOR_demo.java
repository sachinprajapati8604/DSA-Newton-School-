package com.company;

import java.util.Scanner;
// question can be asked as find the element in array  which appears only once
// we can do this using XOR
//Time complexity : O(n).
public class XOR_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int xor=arr[0];
        for(int i=1;i<n;i++){
            xor=xor^arr[i];
        }
        System.out.println("element which appears once is : "+xor);
    }
}
