/*Problem Statement:
A school collects students’ ages (ranging from 10 to 18) and wants them sorted. Implement Counting Sort for this task.
Hint:
Create a count array to store the frequency of each age.
Compute cumulative frequencies to determine positions.
Place elements in their correct positions in the output array.
*/
package com.practiceproblem.countsort;

import java.util.Arrays;

public class Sorting_Ages_Using_Count_Sort {
    public static void countSort(int []age){
        //finding the max element
        int max=Integer.MIN_VALUE;
        for(int i=0;i<age.length;i++){
            if(age[i]>max){
                max=age[i];
            }
        }
        // finding the min element
        int min=Integer.MAX_VALUE;
        for(int i=0;i<age.length;i++){
            if(age[i]<min){
                min=age[i];
            }
        }
        //range of the count arrray
        int range = max-min+1;
        int count[]=new int [range];

 //storing the count particular element and storing in that index only
        for(int i : age){
            count[i-min]++;
        }
        int idx=0;
        for(int i=0;i<range;i++){
            while(count[i]>0){
                age[idx++]=i+min;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int age[]={10,13,12,14,17,18,15,11,15};

        System.out.println("Ages of the student before sorting are : "+ Arrays.toString(age));
        countSort(age);
        System.out.println("Ages after sorting the array : "+Arrays.toString(age));
    }
}
