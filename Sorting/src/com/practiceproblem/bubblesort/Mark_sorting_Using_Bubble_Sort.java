/*A school maintains student marks in an array. Implement Bubble Sort to sort the student marks in ascending order.
Hint:
Traverse through the array multiple times.
Compare adjacent elements and swap if needed.
Repeat the process until no swaps are required.
*/

package com.practiceproblem.bubblesort;

import java.util.Arrays;


public class Mark_sorting_Using_Bubble_Sort {
    //bubble sort method to sort the marks
    public static void bubbleSort(int marks[]){
        //outer loop take each time one element and compare with each element and place it in its correct palce
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks.length;j++){
                if(marks[i]<marks[j]){
                    int temp = marks[i];
                    marks[i]=marks[j];
                    marks[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // initializing array of student marks
        int marks[]={76,78,95,67,89,78,91};

        //marks before sorting are :
        System.out.println("Students marks before sorting : "+ Arrays.toString(marks));

        bubbleSort(marks);
        System.out.println("Students marks after sorting : "+Arrays.toString(marks));
    }
}
