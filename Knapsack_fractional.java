package com.company;

import java.util.*;

public class Knapsack_fractional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int W = sc.nextInt();
        int weight[] = new int[n];
        int value[] = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        //creating value divide by weight array
        Integer vbyw_array[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            vbyw_array[i] = value[i] / weight[i];
        }
        int profit = Knapsack_maxProfit(weight, value, vbyw_array, n, W);
        System.out.println(profit);
    }

    public static int Knapsack_maxProfit(int w[], int v[], Integer vbyw[], int n, int W) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        ArrayList<Integer> weight_list = new ArrayList<>();
        ArrayList<Integer> value_list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            weight_list.add(w[i]);
            value_list.add(v[i]);
        }
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> temp_list = new ArrayList<>();
            temp_list.add(weight_list.get(i));
            temp_list.add(value_list.get(i));
            hm.put(vbyw[i], temp_list);
        }

        Arrays.sort(vbyw, Collections.reverseOrder());
        int i = 0;
        int profit = 0;

        while (W > hm.get(vbyw[i]).get(0)) {
            int value = hm.get(vbyw[i]).get(1);  //getting second value of hashmap in values arraylist
            int weight = hm.get(vbyw[i]).get(0);  //getting first value of hashmap in values arraylist
            profit += value;
            W -= weight;
            i++;
        }
        //cheking condition if weight is still remain will go for fractional
        if (W > 0) {
            int value = hm.get(vbyw[i]).get(1);
            int fractional_profit = (W * value) / hm.get(vbyw[i]).get(0);
            profit += fractional_profit;
        }
//        System.out.println("profit : "+profit);
//        System.out.println(hm);
        return profit;
    }
}
