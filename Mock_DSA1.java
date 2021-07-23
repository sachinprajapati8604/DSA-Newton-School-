package com.company;

import java.util.*;

public class Mock_DSA1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int m = sc.nextInt();
            int res = getMinimunm(n, s, m);
            System.out.println(res);
            testcase--;
        }

    }

    private static int getMinimunm(int n, int s, int m) {
        if (m < s) {
            return m;
        }
        return -1;
    }

}
