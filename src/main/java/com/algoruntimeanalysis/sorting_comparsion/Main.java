/*Compare sorting algorithms Bubble Sort (O(N²)), Merge Sort (O(N log N)), and Quick Sort (O(N log N)).
Approach:
Bubble Sort: Repeated swapping (inefficient for large data).
Merge Sort: Divide & Conquer approach (stable).
Quick Sort: Partition-based approach (fast but unstable).



Comparative Analysis:
Dataset Size (N)
Bubble Sort (O(N²))
Merge Sort (O(N log N))
Quick Sort (O(N log N))
1,000
50ms
5ms
3ms
10,000
5s
50ms
30ms
1,000,000
Unfeasible (>1hr)
3s
2s

Expected Result:
Bubble Sort is impractical for large datasets.
Merge Sort & Quick Sort perform well.
*/
package com.algoruntimeanalysis.sorting_comparsion;



import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // initializing array for multiple array size
        int []size = {1000, 10000, 1000000};
        // random class is used to take random element
        Random random = new Random();
        // running loop up to size array length
        for (int i = 0; i < size.length; i++) {
            int[] arr = new int[size[i]];
            // initializing array
            for (int j = 0; j < size[i]; j++) {
                arr[j] = random.nextInt(size[i]);
            }
            // storing execution time
            long startTime = System.nanoTime();
            System.out.println("Sorting done by Bubble sort for " + size[i] + " size array : ");
            Bubble_Sort bubblesort = new Bubble_Sort();
            bubblesort.bubbleSort(arr.clone());
            // storing end time
            long endTime = System.nanoTime();
            // printing time taken by linear search
            System.out.println("Time taken by Bubble sort approach : " + (endTime - startTime) / 1000000.0 + " ms");

            System.out.println("**************");

            // storing execution time for binary search
            long startTime2 = System.nanoTime();
            System.out.println("Sorting done by Merge sort for " + size[i] + " size array : ");
            Merge_Sort mergesort = new Merge_Sort();
            int s = 0;
            int e = arr.length -1;
            mergesort.mergeSort(arr.clone(), s, e);
            // storing end time for binary search
            long endTime2 = System.nanoTime();
            // printing time taken by binary search
            System.out.println("Time taken by Merge Sort approach : " + (endTime2 - startTime2) / 1000000.0 + " ms");
            System.out.println("**************");

            // storing execution time for binary search
            long startTime3 = System.nanoTime();
            System.out.println("Sorting done by Quick sort for " + size[i] + " size array : ");
            Quick_Sort quicksort = new Quick_Sort();
            int start = 0;
            int end = arr.length-1;
            quicksort.quickSort(arr.clone(), start, end);
            // storing end time for binary search
            long endTime3 = System.nanoTime();
            // printing time taken by binary search
            System.out.println("Time taken by Quick Sort approach : " + (endTime3 - startTime3) / 1000000.0 + " ms");
            System.out.println("**************");
            System.out.println("##############################################################################");

        }
    }
}

