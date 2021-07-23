package com.company;

import java.util.Scanner;

public class String_longest_coommon_subsequence {
    //find longest common subsequence from the array string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String strArr[] = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }
        System.out.printf(Longest_common_subsequence(strArr, n));

    }

    private static String Longest_common_subsequence(String strArr[], int n) {
        if (n == 1) {
            return strArr[0];
        }
        String short_str = strArr[0];
        for (int i = 0; i < n; i++) {
            if (strArr[i].length() < short_str.length()) {
                short_str = strArr[i];
            }
        }
        String output = "";
        for (int i = 0; i < short_str.length(); i++) {
            boolean isCharAvailable = true;
            for (int j = 0; j < n; j++) {
                if (strArr[j].charAt(i) != short_str.charAt(i)) {
                    isCharAvailable = false;
                    break;
                }
            }
            if (isCharAvailable) {
                output += strArr[0].charAt(i);
            } else {
                break;
            }

        }
        if (output == "") {
            return "-1";
        } else {
            return output;
        }

    }
}
