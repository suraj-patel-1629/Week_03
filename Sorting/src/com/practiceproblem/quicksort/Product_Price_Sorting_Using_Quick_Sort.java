/*An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
Hint:
Pick a pivot element (first, last, or random).
Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
Recursively apply Quick Sort on left and right partitions.
*/
package com.practiceproblem.quicksort;

import java.util.Arrays;

public class Product_Price_Sorting_Using_Quick_Sort {
    public static void quickSort(int []price,int s,int e){
      // base case
        if(s>=e){
            return;
        }
        // storing correct place of pivot element to get it calling partion method
        int pivot = partion(price,s,e);
        // again applying quicksort for rest of the array
        quickSort(price,s,pivot-1);
        quickSort(price,pivot+1,e);
    }
    // method to find the correct place of pivot element
    public static int partion(int price[],int s, int e){

        int pivot = price[s];
        //count variable for storing the count of the smaller element than pivot element
        int cnt=0;
        for(int i=s+1;i<=e;i++){
            if(price[i]<=pivot){
                cnt++;
            }
        }
        // finding the correct index for pivot element
        int pivotIndx= s+cnt;
        int temp = price[pivotIndx];
        price[pivotIndx]=price[s];
        price[s]=temp;

        // ensuring the element at the left are smaller
        // than pivot element and element at the right are greater than pivot element
        while(s<=pivotIndx && e>pivotIndx){
            while(price[s]<price[pivotIndx]){
                s++;
            }
            while(price[e]>price[pivotIndx]){
                e--;
            }
            if(s<=pivotIndx && e>pivotIndx){
                int temp1 =price[s];
                price[s]=price[e];
                price[e]=temp1;
            }
        }
        // returning the pivot element index
        return pivotIndx;
    }
    public static void main(String[] args) {
        int price[]={123,453,765,234,986};
        //displaying the price of the array before sorting
        System.out.println("price of the product before sorting : "+ Arrays.toString(price));
        int s =0;
        int e =price.length;
        quickSort(price,s,e-1);
        System.out.println("price of the product after sorting : "+Arrays.toString(price));

    }

}
