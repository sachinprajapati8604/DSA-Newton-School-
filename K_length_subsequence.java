package com.company;

import java.util.Scanner;

//subsequence means we can make a combination from anywhere in forward direction
// contiguous not necessary
public class K_length_subsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printSubsequence(arr,n,k);
    }
    private  static  void  printSubsequence(int arr[],int n,int r){
        for(int i=0;i<=n-r;i++){
            for(int j=i;j<r+i;j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
        }
    }
}
