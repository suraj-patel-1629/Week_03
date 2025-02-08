package com.algoruntimeanalysis.sorting_comparsion;

import java.util.Arrays;

public class Merge_Sort {
    //mergeSort method for dividing the array
    public void mergeSort(int[] arr, int s, int e) {
        // comparing start and end index
        if (s >= e) {
            return;
        }
        // calculating mid element
        int mid = s + (e - s) / 2;
        //applying mergeSort for left and right part
        mergeSort(arr, s, mid);
        mergeSort(arr, mid + 1, e);
        merge(arr, s, mid, e);
    }

    public void merge(int[] arr, int s, int mid, int e) {
        //creating array
        int[] temp = new int[e - s + 1];
        int p1 = s;
        int p2 = mid + 1;
        int p3 = 0;

        // Merging two half
        while (p1 <= mid && p2 <= e) {
            if (arr[p1] <= arr[p2]) {
                temp[p3++] = arr[p1++];
            } else {
                temp[p3++] = arr[p2++];
            }
        }

        // Copying remaining elements from the left half
        while (p1 <= mid) {
            temp[p3++] = arr[p1++];
        }

        // Copying remaining elements from the right half
        while (p2 <= e) {
            temp[p3++] = arr[p2++];
        }
        // copying the sorted element back to array
        int k=0;
        for(int i=s;i<=e;i++){
            arr[i]=temp[k++];
        }
    }

    // Test function
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10000); // Fill array with random numbers
        }

        Merge_Sort sorter = new Merge_Sort();
        sorter.mergeSort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
