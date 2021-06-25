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

        //1.Signed  Right shift operator (>>)

    }
}
