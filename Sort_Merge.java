package com.company;

import java.util.Scanner;

public class Sort_Merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] mergeSort(int arr[], int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            //sort first and second half
            mergeSort(arr, 0, mid);
            mergeSort(arr, mid + 1, end);

            //merge the sorted half
            merge(arr, start, mid, end);
        }
        return arr;

    }

    private static void merge(int arr[], int start, int mid, int end) {
        int l = mid - start + 1;  //length of left subarray
        int r = end - mid;     //length of right subarray

        int leftSortedArray[] = new int[l];
        int rightSortedArray[] = new int[r];
        //copy the data
        for (int i = 0; i < l; i++) {
            leftSortedArray[i] = arr[start + i];
        }
        for (int i = 0; i < r; i++) {
            rightSortedArray[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0; //intial index of  first and second subarray
        int k = start;   //initial index of mergeed subarray

        //traverse both the array
        while (i < l && j < r) {
            //compare the element
            if (leftSortedArray[i] <= rightSortedArray[j]) {
                arr[k] = leftSortedArray[i];
                i++;
            } else {
                arr[k] = rightSortedArray[j];
                j++;
            }
            k++;
        }
        while (i < l) {
            arr[k] = leftSortedArray[i];
            i++;
            k++;
        }
        while (j < r) {
            arr[k] = rightSortedArray[j];
            j++;
            k++;
        }
    }
}
