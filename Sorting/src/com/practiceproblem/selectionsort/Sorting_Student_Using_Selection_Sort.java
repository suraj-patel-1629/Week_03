/*A university needs to sort students’ exam scores in ascending order. Implement Selection Sort to achieve this.
Hint:
Find the minimum element in the array.
Swap it with the first unsorted element.
Repeat the process for the remaining elements.
*/

package com.practiceproblem.selectionsort;

import java.util.Arrays;

public class Sorting_Student_Using_Selection_Sort {
    // method od selection sort
    public static void selectionSort(double []score){

        for(int i =0;i<score.length-1;i++){
            double min =score[i];
            int minidx = i;
            for(int j=i+1;j<score.length;j++){
                if(score[j]<min){
                    min=score[j];
                    minidx=j;
                }

            }
            double temp=score[i];
            score[i]=score[minidx];
            score[minidx]=temp;

        }
    }

    public static void main(String[] args) {
        double score[]={98.7,96,67,76,87};

        // displaying the score of the student before sorting
        System.out.println("Exam score of the students before sorting: "+ Arrays.toString(score));
        //calling the method to sort using selecton sort
        selectionSort(score);
        System.out.println("Exam score of the student after sorting : "+Arrays.toString(score));
    }


}
