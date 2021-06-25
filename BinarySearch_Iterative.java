package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Iterative {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int res=bianrySearch(arr,n,key);
        if(res==-1){
            System.out.println("Element is not present ");
        }else{
            System.out.println("Element is present at index :" +res);
        }

    }
    private  static  int bianrySearch(int [] arr,int n, int key){
        Arrays.sort(arr);
        int start=0,end=n-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return  mid;
            }
            if(arr[mid]<key){ //right side
                start=mid+1;
            }else{ //left side
                end=mid-1;
            }
        }
        return  -1;

    }
}
