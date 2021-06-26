package com.company;

import java.util.*;

public class Test_demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int targetSum=sc.nextInt(); //9
        int arr[]=new int[n];  // 2 ,4,3,5,5
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for(int i=0;i<n;i++){   //i=0
            sum=arr[i];
            for(int j=i+1;j<n;j++){ //j=2
                sum=arr[i]+arr[j];   //9,
                if(sum==targetSum){
                    System.out.println("["+i+" , "+j+"]");
                }
            }
        }

    }

}
