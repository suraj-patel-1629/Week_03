package com.algo_runtime_analysis.linear_and_binarysearch;
// Linear search class contain linear search method
public class LinerSearch {
   // linear search method to check whether element is present in an array or not
    public void linerSearch(int []arr,int target){
        // iterating over the loop
        for(int i=0;i<arr.length;i++){
            // if target is equal to element printing index and exit the loop
            if(arr[i]==target){
                System.out.println("Found at index no : "+i);
                // exit
                return;
            }
        }


    }

}
