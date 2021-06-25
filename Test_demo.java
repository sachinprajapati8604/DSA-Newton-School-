package com.company;

import java.util.*;

public class Test_demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList <Integer> al=new ArrayList<>();

        String str="1234";
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        int num=Integer.parseInt(rev);
        while(num>0){
            int rem=num%10;
            al.add(rem);
            num=num/10;
        }


        System.out.println(al);



    }

}
