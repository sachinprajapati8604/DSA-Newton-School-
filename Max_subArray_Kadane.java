package com.company;

import java.util.Scanner;

public class Max_subArray_Kadane {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Sum of sub array using Kadane Algorithm : "+Kadane_subarray(arr,n));
        System.out.println("Sum of subarray using Dynamic Programming : "+byDynamic(arr,n));
    }
    private  static  int Kadane_subarray(int a[],int n){
//        time complexity is O(n)
        int max_so_far=a[0];
        int max_ending_here=0;
        for(int i=0;i<n;i++){
            max_ending_here = max_ending_here + a[i];
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }
            else if (max_so_far < max_ending_here) {
                max_so_far = max_ending_here;
            }
        }
        return max_so_far;
    }
    public  static  int byDynamic(int arr[],int n){
        int max_so_far=arr[0];
        int current_max=arr[0];
        for(int i=1;i<n;i++){
            current_max=Math.max(arr[i],arr[i]+current_max);
            max_so_far=Math.max(max_so_far,current_max);
        }
        return  max_so_far;
    }
}
