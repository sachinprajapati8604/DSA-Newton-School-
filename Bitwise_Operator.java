package com.company;

import java.util.Scanner;

public class Bitwise_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=3;  //binary of 3 is : 011
        int b=5;  //binary of 5 is : 101
        //Bitwise OR operator |
        System.out.println("OR is : "+(a|b));
        //Bitwise AND operator &
        System.out.println("AND is : "+(a&b));
        //Bitwise XOR operator  ^
        System.out.println("XOR is : "+(a^b));
        //Bitwise complement ~
        //bitwise NOT
        //compiler will print 2's complement
        System.out.println("2's Complement  is : "+~a);
        // Now i am going to learn bitwise shift operator

        //1.Signed  Left shift operator (<<)
        int ls=8;  //1 0 0 0
        int leftShiftValue=ls<<2;  //  1 0 0 0 0 0 =3  // means it will add two more zero in right most
        System.out.println("Left shift is  : "+leftShiftValue);
        //2. Right Shift operator (>>)
        int rightShiftValue=ls>>2;    // 1 0 //it will loose the two bit from right most side
        System.out.println("Right shift is :  "+rightShiftValue);

    }
}
