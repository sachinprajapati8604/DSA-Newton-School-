package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_merge {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        mergeSort(arr,n);
        for(int i:arr){
            System.out.print(i+" ");
        }
//        System.out.println(Arrays.toString(mergeSort(arr, n)));

    }
    //complexity of merge sort is n*n
    private  static  int[] mergeSort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}
