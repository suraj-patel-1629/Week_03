package com.algoruntimeanalysis.sorting_comparsion;



public class Quick_Sort {
    public void quickSort(int[] arr, int s, int e) {
        // Comparing start and end index
        if (s >= e) {
            return;
        }
        // Calling partition method to get exact position of pivot element
        int pivotIndex = partition(arr, s, e);
        // Applying quick sort for remaining elements
        quickSort(arr, s, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, e);
    }

    // Partition method for calculating exact position of pivot element
    public int partition(int[] arr, int s, int e) {
        int pivot = arr[s];  // Choosing first element as pivot
        int cnt = 0;

        // Counting how many elements are smaller than pivot
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot) {
                cnt++;
            }
        }

        // Calculating the current index of pivot element
        int pivotIndex = s + cnt;
        int temp = arr[s];
        arr[s] = arr[pivotIndex];
        arr[pivotIndex] = temp;

        int i = s, j = e;

        // Confirming the pivot element is placed at correct place
        while (i < pivotIndex && j > pivotIndex) {
            // Finding element greater than pivot on the left side
            while (i < pivotIndex && arr[i] <= pivot) {
                i++;
            }
            // Finding element smaller than pivot on the right side
            while (j > pivotIndex && arr[j] > pivot) {
                j--;
            }
            // Swapping elements to maintain correct order
            if (i < pivotIndex && j > pivotIndex) {
                int tem = arr[i];
                arr[i] = arr[j];
                arr[j] = tem;
            }
        }
        // Returning pivot index for recursion
        return pivotIndex;
    }
}
