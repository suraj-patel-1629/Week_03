//Problem Statement: Comparing Different Data Structures for Searching
//Objective:
//Compare Array (O(N)), HashSet (O(1)), and TreeSet (O(log N)) for searching elements.
//Approach:
//Array: Linear search (O(N)).
//HashSet: Uses hashing (O(1) on average).
//TreeSet: Balanced BST (O(log N)).
//Comparative Analysis:
//Dataset Size (N)
//Array Search (O(N))
//HashSet Search (O(1))
//TreeSet Search (O(log N))
//Expected Result:
//HashSet is fastest for lookups but requires extra memory.
//TreeSet maintains order but is slightly slower than HashSet.

package com.algoruntimeanalysis.searchcomparison;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class SearchComparison {
    public static void main(String[] args) {
        // Define dataset sizes
        int[] sizes = {1000, 10000, 1000000};

        for (int size : sizes) {

            // Generate random dataset
            int[] array = new int[size];
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();
            Random random = new Random();
            //Assign data
            for (int i = 0; i < size; i++) {
                int num = random.nextInt(size);
                array[i] = num;
                hashSet.add(num);
                treeSet.add(num);
            }

            // Select a random key to search
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
        }
    }

}
