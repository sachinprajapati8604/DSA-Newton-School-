package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class String_remove_vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        //use this library function
        System.out.println(str.replaceAll("[aeiouAEIOU]",""));

        //or use your own logic
        System.out.println( removeVowel(str));

    }
    private  static  String removeVowel(String s){
        ArrayList<Character> al=new ArrayList<>();
        al.add('a');
        al.add('e');
        al.add('i');
        al.add('o');
        al.add('u');
        StringBuffer sb=new StringBuffer(s);
        for(int i=0;i<sb.length();i++){
            if(al.contains(sb.charAt(i))){
                sb.replace(i,i+1,"");
                i--;
            }
        }

        return sb.toString();
    }
}
