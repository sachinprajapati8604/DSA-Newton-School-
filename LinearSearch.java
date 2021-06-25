package com.company;

import java.util.Scanner;

public class LinearSearch {
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int key=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=LinearSearch(arr,key);
        if(result==-1){
            System.out.println("Element is not present in the array");
        }else{
            System.out.println("Element is present at index : "+result);
        }

    }
    // time complexity of linear search O(n),because it is iterative process upto last element of array
    public  static  int LinearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

}
