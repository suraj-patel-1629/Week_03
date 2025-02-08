//Problem Statement: Recursive vs Iterative Fibonacci Computation
//Objective:
//Compare Recursive (O(2ⁿ)) vs Iterative (O(N)) Fibonacci solutions.
//Approach:
//Recursive:
//public static int fibonacciRecursive(int n) {
//    if (n <= 1) return n;
//    return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
//}
//
//Iterative:
//public static int fibonacciIterative(int n) {
//    int a = 0, b = 1, sum;
//    for (int i = 2; i <= n; i++) {
//        sum = a + b;
//        a = b;
//        b = sum;
//    }
//    return b;
//}
//Comparative Analysis:
//Fibonacci (N)
//Recursive (O(2ⁿ))
//Iterative (O(N))
//Expected Result:
//Recursive approach is infeasible for large values of N due to exponential growth.
//The iterative approach is significantly faster and memory-efficient.

package com.algoruntimeanalysis.fibonaccicomputation;

import java.util.Random;

public class RecursiveVSIterativeFibonacciComputation {

    public static void main(String[] args) {
        Random random = new Random();

        //generating random number for fibonacci
        int number = random.nextInt(80);
        //Total time calculation for iterative approach
        long startTime = System.currentTimeMillis();
        int result1 = IterativeFibonacciSeries.fibonacciIterative(number);
        long totalTimeByIterative= System.currentTimeMillis()- startTime;

        //Total time calculation for recursive approach
        startTime = System.currentTimeMillis();
        int result2=RecursiveFibonacciSeries.fibonacciRecursive(number);
        long totalTimeByRecursion = System.currentTimeMillis()- startTime;

        //Displaying the result
        System.out.println("Number is: "+ number);
        System.out.println("Result by iterative is: "+ result1);
        System.out.println("Result by recursion is: "+result2);
        System.out.println("Time taken to compute fibonacci by iterative approach is: "+ totalTimeByIterative+ " MS");
        System.out.println("Time taken to compute fibonacci by recursion approach is: "+ totalTimeByRecursion+ " MS");
    }
}
