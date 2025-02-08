package com.algo_runtime_analysis.searching_test_cases;

import com.algo_runtime_analysis.linear_and_binarysearch.BinarySearch;
import com.algo_runtime_analysis.linear_and_binarysearch.LinerSearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SearchingTest {
    @Test
    public void test_Linear_Search(){
        int arr[]={1,2,5,4,6,3};
        LinerSearch linearSearch=new LinerSearch();

        assertEquals(2, linearSearch.linerSearch(arr,5));
        assertEquals(-1, linearSearch.linerSearch(arr,12));

    }

    @Test
    public void test_Binary_Search(){
        int arr[]={1,2,5,4,6,3};
        BinarySearch binarySearch= new BinarySearch();
        assertEquals(2,binarySearch.binarySearch(arr,5));
        assertEquals(-1, binarySearch.binarySearch(arr,12));

    }



}
