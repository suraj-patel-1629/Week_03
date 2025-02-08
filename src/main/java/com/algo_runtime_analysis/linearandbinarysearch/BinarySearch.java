package com.algo_runtime_analysis.linearandbinarysearch;

public class BinarySearch {

    // Method to perform Binary Search
    public int binarySearch(int[] arr, int target) {
        // Start index
        int s = 0;
        // End index
        int e = arr.length - 1;

        // running loop until condition does not match
        while (s <= e) {
            // finding mid element
            int mid = s + (e - s) / 2;

            // If the middle element is the target element return  mid
            if (arr[mid] == target) {

                // exit method
                return mid;
            }
            // If the target is smaller than mid search in the right half
            else if (arr[mid] > target) {
                e = mid - 1;
            }
            // If the target is greater than mid search in the right half
            else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
