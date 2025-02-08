package com.algoruntimeanalysis.fibonaccicomputation;

public class RecursiveFibonacciSeries {
    //recursive method  to find nth fibonacci number
    public static int fibonacciRecursive(int n) {
        //base case
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
