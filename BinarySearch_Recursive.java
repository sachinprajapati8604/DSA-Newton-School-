package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_Recursive {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int start=0,end=n-1;
        int res=binarySearch(arr,start,end,key);
        if(res==-1){
            System.out.println("Element is not present ");
        }else{
            System.out.println("Element is present at index : "+res);
        }
    }
    private  static  int binarySearch(int arr[], int start, int end, int key){
        if(end>=start){
            int mid=start+(end-start)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                return  binarySearch(arr,mid+1,end,key);
            }else{
                return binarySearch(arr,start,mid-1,key);
            }

        }
        return -1;
    }
}
