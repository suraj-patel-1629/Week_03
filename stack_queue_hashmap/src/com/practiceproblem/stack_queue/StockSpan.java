package com.practiceproblem.stack_queue;

import java.util.Stack;

/*Problem: For each day in a stock price array, calculate the span (number of consecutive days the price was less than
 or equal to the current day's price).
Hint: Use a stack to keep track of indices of prices in descending order.*/
public class StockSpan {
    public static void main(String[] args) {
        // stack for keeping track of prices
        Stack<Integer>st = new Stack<>();

        // array with stock price
        int arr []= {100,80,60,70,60,75,85};
        //value for  counting the span
        int count;
        for(int i=0;i<arr.length;i++){
            count=0;
            for(int j=i ;j>=0;j--){
                if(arr[i]>=arr[j]){
                    count++;
                }else{
                    break;
                }
            }
            st.push(count);
        }
        // printing the span result
        System.out.println("track of span : "+st);
    }
}
