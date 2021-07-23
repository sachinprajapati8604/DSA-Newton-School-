package com.company;

import java.util.Scanner;

class Overloadaing {
    public static void Area(int a, int b) {
        System.out.println("Area of Rectangle : " + a * b);
    }

    public static void Area(int a) {
        System.out.println("Area of Square  : " + a * a);
    }

    public static void Area(double r) {
        System.out.println("Area of circle :  " + Math.PI * r * r);
    }
}

public class OverLoading_example2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double r = sc.nextDouble();

        Overloadaing ol = new Overloadaing();
        ol.Area(a, b);
        ol.Area(a);
        ol.Area(r);

    }
}
