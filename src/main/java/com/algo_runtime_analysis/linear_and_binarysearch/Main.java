//Objective:
//        Compare the performance of Linear Search (O(N)) and Binary Search (O(log N)) on different dataset sizes.
//        Approach:
//        Linear Search: Scan each element until the target is found.
//        Binary Search: Sort the data first (O(N log N)), then perform O(log N) search.
//        Comparative Analysis:
//        Dataset Size (N)
//        Linear Search (O(N))
//        Binary Search (O(log N))
//        1,000
//        1ms
//        0.01ms
//        10,000
//        10ms
//        0.02ms
//        1,000,000
//        1s
//        0.1ms
//
//        Expected Result:
//        Binary Search performs much better for large datasets, provided data is sorted.

package com.algo_runtime_analysis.linear_and_binarysearch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // initializing array for multiple array size
        int size[]={1000,10000,100000};
        // random class is used to take random element
        Random random = new Random();
        // running loop up to size array length
        for(int i=0;i<size.length;i++){
            int [] arr= new int[size[i]];
            // initializing array
            for(int j=0;j<size[i];j++){
                arr[j]=j;
            }
            // taking random input
            int target = random.nextInt(size[i]);

            // storing execution time
            long startTime = System.nanoTime();
            System.out.println("Linear Search Algorithm analysis for "+size[i]+" size array : ");
            LinerSearch ls = new LinerSearch();
            ls.linerSearch(arr,target);
            // storing end time
            long endTime = System.nanoTime();
            // printing time taken by linear search
            System.out.println("Time taken by linear search approch : "+(endTime-startTime)/1000000.0+" ms");

            System.out.println("**************");

            // storing execution time for binary search
            long startTime2 = System.nanoTime();
            System.out.println("Binary Search Algorithm analysis for "+size[i]+" size array : ");
            BinarySearch bs = new BinarySearch();
            bs.binarySearch(arr,target);
            // storing end time for binary search
            long endTime2 = System.nanoTime();
            // printing time taken by binary search
            System.out.println("Time taken by Binary search approach : "+(endTime2-startTime2)/1000000.0+" ms");

            System.out.println("################################################################");


        }
    }
}