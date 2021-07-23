package com.company;

import java.util.Scanner;

// by using different types of arguments.
class Overloading {
    //method with 2 parameter
    public static int Multiply(int a, int b) {
        return a * b;
    }

    //method with 2 double parameter
    public static double Multiply(double a, double b) {
        return a * b;
    }
}

public class Overloading_Example {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Overloading ol = new Overloading();

        System.out.println(ol.Multiply(a, b));
        System.out.println(ol.Multiply(4.78, 23.67));
    }
}
