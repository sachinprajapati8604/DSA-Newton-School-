package com.company;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("HCF  :" + getGCD(a, b));
        int gcd = getGCD(a, b);
        int lcm = (a * b) / gcd;
        System.out.println("LCM :" + lcm);

    }

    private static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }
}
