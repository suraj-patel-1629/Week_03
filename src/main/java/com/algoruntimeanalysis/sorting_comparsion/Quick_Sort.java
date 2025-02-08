package com.algoruntimeanalysis.sorting_comparsion;



public class Quick_Sort {
    // method for quick sort
    public  void quickSort(int []arr,int s,int e){
        // comparing start and end index
        if(s>=e){
            return;
        }
        // calling partition method to get exact position of pivot element
        int pivotIndex=partition(arr,s,e);
       // applying quick sort for remaining element
        quickSort(arr,s,pivotIndex-1);
        quickSort(arr,pivotIndex+1,e);
    }
    // partition method for calculating exact position of pivot element
    public int partition(int []arr, int s ,int e){
        int pivot=arr[s];
        int cnt=0;
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                cnt++;
            }
        }
        //calculating the current index of pivot element
        int pivotIndex = s+cnt;
        int temp = arr[s];
        arr[s]=arr[pivotIndex];
        arr[pivotIndex]=temp;
        int i=s,j=e;
        //confirming the pivot element is placed at correct place
        while(i<pivotIndex && pivotIndex<j){
            while(i<pivot){
                i++;
            }
            while(j>pivot){
                j--;
            }
            if(i<pivotIndex && pivotIndex<j){
                int tem = arr[i];
                arr[i]=arr[j];
                arr[j]=tem;
            }

        }

        return pivotIndex;
    }
}
