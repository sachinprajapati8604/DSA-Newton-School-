package com.company;

import java.util.*;


public class Test_demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = 5;
        for (int i = row; i >= 1; i--) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }

}