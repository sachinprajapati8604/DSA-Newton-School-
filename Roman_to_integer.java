package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Roman_to_integer {
    private static final HashMap<Character, Integer> roman_map = new HashMap<Character, Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    private static int romanToInteger(String s) {
        int sum = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (i != n - 1 && roman_map.get(s.charAt(i)) < roman_map.get(s.charAt(i + 1))) {
                sum += roman_map.get(s.charAt(i + 1)) - roman_map.get(s.charAt(i));
                i++;
            } else {
                sum += roman_map.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = s.toUpperCase();
        try {
            System.out.println("integer form of roman number : " + romanToInteger(str));
        } catch (Exception e) {
            System.out.println("Please enter only roman character like : 'I','V','X','L','C','D','M'.");
        }

    }
}
