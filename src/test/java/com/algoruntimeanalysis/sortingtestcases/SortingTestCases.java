package com.algoruntimeanalysis.sortingtestcases;

import com.algoruntimeanalysis.sorting_comparsion.Bubble_Sort;
import com.algoruntimeanalysis.sorting_comparsion.Merge_Sort;
import com.algoruntimeanalysis.sorting_comparsion.Quick_Sort;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class SortingTestCases {
    @Test
    public void testBubbleSort(){
        int []arr={3,5,6,7,2,7};

        int []result={2,3,5,6,7,7};
        Bubble_Sort bubbleSort = new Bubble_Sort();
        bubbleSort.bubbleSort(arr);
        assertArrayEquals(result,arr);
    }

    @Test
    public void testMergeSort(){
        int []arr={3,5,6,7,2,7};
        int s =0;
        int e =arr.length-1;
        int []result={2,3,5,6,7,7};
        Merge_Sort mergeSort= new Merge_Sort();
        mergeSort.mergeSort(arr,s,e);
       // System.out.println(Arrays.toString(arr));
        assertArrayEquals(result,arr);
    }
    @Test
    public void testQuickSort(){
        int []arr={3,5,6,7,2,7};
        int s =0;
        int e =arr.length-1;
        int []result={2,3,5,6,7,7};
        Quick_Sort quickSort = new Quick_Sort();

        quickSort.quickSort(arr,s,e);
        assertArrayEquals(result,arr);
    }

}
