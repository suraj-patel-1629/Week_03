package com.algo_runtime_analysis.sorting_comparsion;

public class Bubble_Sort {
    public void bubbleSort(int []arr){

        for(int i=0;i<arr.length;i++){
            if(arr.length>999999){
                System.out.println("Not feasible ");
                break;
            }
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
    }

}
