/*Problem Statement:
A company receives job applications with different expected salary demands.
Implement Heap Sort to sort these salary demands in ascending order.
Hint:
Build a Max Heap from the array.
Extract the largest element (root) and place it at the end.
Re heapify the remaining elements and repeat until sorted.
*/
package com.practiceproblem.heapsort;

import java.util.Arrays;

public class Salary_Demand_Using_Heap_Sort {
    //heapsort method with generate a max heap and than swap first element with last element
    public static void heapsort(double []salary){
        int n = salary.length;
        for(int i=n/2-1;i>=0;i--){
            // calling heapify method to generate max heap
            heapify(salary,n,i);
        }
        for(int i=n-1;i>=0;i--){
            double temp=salary[i];
            salary[i]=salary[0];
            salary[0]=temp;
     // calling the heapify method for remaining element
            heapify(salary,i,0);
        }
    }

    //heapify method which generate max heap
    public static void heapify(double []salary,int n,int i){
        //storing the root index
        int largest=i;
        // storing the left index of root element
        int left=2*i+1;
        //storing the right index of root element
        int right=2*i+2;

        //comparing the left index with length of array
        if(left<n && salary[left]>salary[largest]){
            largest=left;
        }
        if(right<n && salary[right]>salary[largest]){
            largest=right;
        }
        // if root index not equal to i
        if(largest!=i){
            double temp=salary[i];
            salary[i]=salary[largest];
            salary[largest]=temp;

        //calling the heapify method again to generate max heap
            heapify(salary,n,largest);
        }

    }
    public static void main(String[] args) {
        double salary[]={50000,504070,56000.87,7600000};
        System.out.println("Demanded salary of the employee before sorting : "+ Arrays.toString(salary));
        heapsort(salary);
        System.out.println("Demanded salary of the employee after sorting : "+Arrays.toString(salary));
    }
}
