package com.company;

import java.util.HashMap;
import java.util.Scanner;
//this question can be asked as :
// find occurance of element
// print non-repeating element
public class Distinct_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printDistinctNumber(arr,n);
    }
    public  static void printDistinctNumber(int []arr,int n){
        //by using hashmap
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1); //(value,count)
            }else{
                hm.put(arr[i],1);
            }
        }

        System.out.println(hm); //this will give occurrence of array value with count
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])==1){
                System.out.println(arr[i]);
            }
        }
    }
}
