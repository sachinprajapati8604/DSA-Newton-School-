package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class GCD_ofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int gcd=getGCD(arr,n);

        System.out.println("GCD  : "+gcd);
    }

    private  static int getGCD(int[] arr, int n){
        int hcf=0;
        for(int i=0;i<n;i++){
             hcf=gcd(arr[i],hcf);
        }
        return hcf;
    }
    private static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        //base case
        if(a==b){
            return a;
        }
        if(a>b){
            return gcd(a-b,b);
        }else {
            return gcd(a,b-a);
        }
    }
}
