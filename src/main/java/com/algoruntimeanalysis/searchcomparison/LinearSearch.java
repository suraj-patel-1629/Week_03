package com.algoruntimeanalysis.searchcomparison;

public class LinearSearch {
    public static boolean search(int[] array, int key) {
        //Method to time comparison at linear search
        long startTime = System.currentTimeMillis();
        for (int num : array) {
            if (num == key) {
                return true;
            }
        }
        return false;
    }
}
