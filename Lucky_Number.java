package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Lucky_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(checkLucky(n,2));
    }
    private  static boolean checkLucky(int n,int itr){
        //this hashset is for dry run for better understanding
//        HashSet <Integer> hs=new HashSet<>();
//        hs.clear();
//        for(int i=1;i<=n;i++){
//            hs.add(i);
//        }
//        System.out.println(hs);
        if(n<itr){
            return true;
        }
        if(n%itr==0){
            return false;
        }

        return checkLucky(n-n/itr,itr+1);

    }
}
