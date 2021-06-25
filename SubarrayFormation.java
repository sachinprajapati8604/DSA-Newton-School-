package com.company;

import java.util.Scanner;

public class SubarrayFormation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printSubarray(arr,n);
    }
    public static  void printSubarray(int [] arr,int n){
//        Time complexity for this method O(n^3)
        int total=n*(n+1)/2;
        System.out.println("Total " +total+ " subarray  can be formed using "+n+ " number  are following  :  ");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
