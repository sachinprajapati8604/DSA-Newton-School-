package com.company;

import java.util.Scanner;

//You are given five inputs: a(integer), b(float ), c(long), d(byte), s(string) respectively. You need to take the input and print a, b, c, d and s in new line.

// input
//5
//5.256
//568746854
//120
//geeks for geeks
public class Input_demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        float b=sc.nextFloat();
        long c=sc.nextLong();
        byte d=sc.nextByte();
        sc.nextLine();
        String s=sc.nextLine();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
    }
}
