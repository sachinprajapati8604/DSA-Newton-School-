package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rat_Maze_problem {

    static List<String> v= new ArrayList<>();
    static String path = "";
//    static final int MAX = 4;

    static boolean isSafe(int r, int c, int m[][],
                          int n, boolean visit[][])
    {
        if (r == -1 || r == n || c == -1 ||
                c == n || visit[r][c] ||
                m[r][c] == 0) {
            return false;
        }

        return true;
    }

    static void printPathUtil(int r, int c, int m[][],
                              int n, boolean visit[][])
    {

        if (r == -1 || r == n || c == -1 ||
                c == n || visit[r][c] ||
                m[r][c] == 0) {
            return;
        }

        if (r == n - 1 && c == n - 1)
        {
            v.add(path);
            return;
        }

        visit[r][c] = true;

        if (isSafe(r + 1, c, m, n, visit))
        {
            path += 'D';
            printPathUtil(r + 1, c, m, n,
                    visit);
            path = path.substring(0, path.length() - 1);
        }

        if (isSafe(r, c - 1, m, n, visit))
        {
            path += 'L';
            printPathUtil(r, c - 1, m, n,
                    visit);
            path = path.substring(0, path.length() - 1);
        }

        if (isSafe(r, c + 1, m, n, visit))
        {
            path += 'R';
            printPathUtil(r, c + 1, m, n,
                    visit);
            path = path.substring(0, path.length() - 1);
        }

        if (isSafe(r - 1, c, m, n, visit))
        {
            path += 'U';
            printPathUtil(r - 1, c, m, n,
                    visit);
            path = path.substring(0, path.length() - 1);
        }
        visit[r][c] = false;
    }

    // Function to store and print
// all the valid paths
    static void printPath(int m[][], int n)
    {
        boolean [][]visit = new boolean[n][n];

        printPathUtil(0, 0, m, n, visit);


        for(int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }

    // Driver code
    public static void main(String[] args)
    {
        //driver code
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m[][]=new int[n][n];
        for (int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=sc.nextInt();
            }

        }
        printPath(m, n);
    }
}
