/*Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.
*/
package com.practiceproblem.insertionsort;

import java.util.Arrays;

public class EmployeeIds_Sorting_Using_Insertion_Sort {
    //in this sorting technique it find the correct place to fit the element
    public static void insertionSort(int empId[]){
        for(int i=1;i<empId.length;i++){
            int temp=empId[i];
            int j=i-1;
            for(;j>=0;j--){
                if(temp<empId[j]){
                    empId[j+1]=empId[j];
                }else{
                    break;
                }
            }
            empId[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        // Intializing array for employee Ids
        int empId[]={101,104,103,108,107,105};
        // employee id before sorting
        System.out.println("Employee Ids before sorting : "+ Arrays.toString(empId));

        insertionSort(empId);
        // employee ids after sorting in acending order
        System.out.println("Employee Ids after sorting : "+Arrays.toString(empId));
    }
}
