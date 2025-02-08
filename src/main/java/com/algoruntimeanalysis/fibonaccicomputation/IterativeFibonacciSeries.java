package com.algoruntimeanalysis.fibonaccicomputation;

public class IterativeFibonacciSeries {
    //iterative method to find nth fibonacci
    public static int fibonacciIterative(int n) {
        if(n==0) return 0;
        int a = 0, b = 1, sum;
        //continue iterate
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }
}
