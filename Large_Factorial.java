package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Large_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> ans_list=new ArrayList<>(getFact(n));  //calling funtion and storing list to this list
        for(Integer i :ans_list){
            System.out.print(i);
        }

    }
    private static ArrayList<Integer>getFact(int N){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        int carry=0;
        int n=1;
        while (n<=N){
            for(int i=0;i<list.size();i++){
                int value=list.get(i)*n+carry;
                list.set(i,value%10);
                carry=value/10;
            }
            if(carry>0){
                while (carry>0){
                    list.add(carry%10);
                    carry=carry/10;
                }
            }
            n++;
            carry=0;
        }
        Collections.reverse(list); //becasue list is appending from last element of number we can see in loop while adding remainder of carry
        return list;
    }
}
