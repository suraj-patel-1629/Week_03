package com.practiceproblem.mergesort;

import java.util.Arrays;

public class BookPrice_Sorting_Using_Merge_Sort {
    // method is used to divide the price of the array
    public static void merge(int []price,int start,int end){
      if(start==end){
          return;

      }
      // finding the mid of the array
     int mid=start+(end-start)/2;
      // recursive call
      merge(price,start,mid);
      merge(price,mid+1,end);
      // merging the method
      mergeSort(price,start,mid,end);

    }
    // method to merge the elements in the sorted order
    public static void mergeSort(int[]price,int s,int m,int e){
        int temp[]= new int[e-s+1];
        int p1=s;
        int p2=m+1;
        int p3=0;
        while(p1<=m && p2<=e){
            if(price[p1]<price[p2] ){
                temp[p3]=price[p1];
                p3++;
                p1++;
            }else{
                temp[p3]=price[p2];
                p3++;
                p2++;
            }
        }
        while(p1<=m){
            temp[p3]=price[p1];
            p3++;
            p1++;
        }
        while(p2<=e){
            temp[p3]=price[p2];
            p3++;
            p2++;
        }
        int k=0;
        while(s<=e){
           price[s]=temp[k];
           k++;
           s++;
        }

    }
    public static void main(String[] args) {
        //array storing the price of the book
        int price[]={200,300,100,569,489,900,700};
        int s=0;
        int e=price.length-1;
        //printing the price of the book before sorting
        System.out.println("Price of the book before sorting : "+ Arrays.toString(price));
        merge(price,s,e);

        // printing the price of the array after sorting
        System.out.println("Price of the book after sorting : "+Arrays.toString(price));
    }
}
