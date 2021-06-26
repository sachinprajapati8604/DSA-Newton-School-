package com.company;

import java.util.Locale;
import java.util.Scanner;

public class string_splitWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s="Hello my name is Sachin Prajapati";
//        String arr[]=s.split(" ");
//        for(String w:arr){
//            System.out.println(w);
//        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                System.out.println();
            }
            System.out.print(s.charAt(i));
        }
        //practice on String methods
        System.out.println();
        String str=" JavaProgram  ";
        //whitespace will be count as string length
        System.out.println(str.trim());
        System.out.println(str.replace("Java","Python"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(0,9));

    }
}
