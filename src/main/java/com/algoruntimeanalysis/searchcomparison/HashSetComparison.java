package com.algoruntimeanalysis.searchcomparison;



import java.util.HashSet;
//Class for element comparison at hashset
public class HashSetComparison{
    //method to search element at hashset with time
    public static boolean search(HashSet<Integer> hashSet, int key) {
       //store true if hashset contains the element
       return  hashSet.contains(key);
    }
}
