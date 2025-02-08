package com.algo_runtime_analysis.linearandbinarysearch;
// Linear search class contain linear search method
public class LinerSearch {
   // linear search method to check whether element is present in an array or not
    public int linerSearch(int []arr,int target){
        // iterating over the loop
        for(int i=0;i<arr.length;i++){
            // if target is equal to element printing index and exit the loop
            if(arr[i]==target){


                return i;
            }
        }

   return -1;
    }

}
