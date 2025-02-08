package com.algoruntimeanalysis.searchcomparison;

import com.algoruntimeanalysis.searchcomparison.LinearSearch;
import org.junit.Test;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SearchComparisonTest {
    @Test
    public void testFor_ArraySearch(){
        int []testArray = {3,1,3,54,6,8,6,3,4,6,7,5,3,87,45};

        assertTrue(LinearSearch.search(testArray,54));
        int[] array = {10, 20, 30, 40, 50};
        assertTrue("30 should be found in the array", LinearSearch.search(array, 30));
        System.out.println("Test Case Passed");
    }
    @Test
    public void testFor_LinearSearchNotFound() {
        int[] array = {10, 20, 30, 40, 50};
        assertFalse("100 should not be found in the array", LinearSearch.search(array, 100));
        System.out.println("Test Case Passed");
    }

    @Test
    public void testFor_HashSetSearchFound() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        assertTrue("20 should be found in the HashSet", HashSetComparison.search(hashSet, 20));
        System.out.println("Test Case Passed");
    }

    @Test
    public void testFor_HashSetSearchNotFound() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        assertFalse("100 should not be found in the HashSet", HashSetComparison.search(hashSet, 100));
        System.out.println("Test Case Passed");
    }

    @Test
    public void testFor_TreeSetSearchFound() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        assertTrue("30 should be found in the TreeSet", TreeSetComparison.search(treeSet, 30));
        System.out.println("Test Case Passed");
    }

    @Test
    public void testFor_TreeSetSearchNotFound() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        assertFalse("100 should not be found in the TreeSet", TreeSetComparison.search(treeSet, 100));
        System.out.println("Test Case Passed");
    }
    private static final int[] SIZES = {1000, 10000, 100000};
    @Test
    public void performanceComparison(){
        for (int size : SIZES) {
            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            Random random = new Random();

            //Generate dataset
            for (int i = 0; i < size; i++) {
                int num = random.nextInt(size);
                array[i] = num;
                hashSet.add(num);
                treeSet.add(num);
            }

            //Select a random key to search
            int key = array[random.nextInt(size)];

            //Measure Linear Search time
            long startTime = System.nanoTime();
            boolean arraySearchResult = LinearSearch.search(array, key);
            long arraySearchTime = System.nanoTime() - startTime;

            //Measure HashSet Search time
            startTime = System.nanoTime();
            boolean hashSetSearchResult = HashSetComparison.search(hashSet, key);
            long hashSetSearchTime = System.nanoTime() - startTime;

            //Measure TreeSet Search time
            startTime = System.nanoTime();
            boolean treeSetSearchResult = TreeSetComparison.search(treeSet, key);
            long treeSetSearchTime = System.nanoTime() - startTime;

            // Print results for comparison
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + arraySearchTime / 1000000.0 + " ms");
            System.out.println("HashSet Search Time: " + hashSetSearchTime / 1000000.0 + " ms");
            System.out.println("TreeSet Search Time: " + treeSetSearchTime / 1000000.0 + " ms");
            System.out.println("*************************************************************************");

            // Assertions (Ensure results are correct)
            assertTrue(arraySearchResult);
            assertTrue(hashSetSearchResult);
            assertTrue(treeSetSearchResult);

            System.out.println("All Test Case Passed");
        }
    }
}
