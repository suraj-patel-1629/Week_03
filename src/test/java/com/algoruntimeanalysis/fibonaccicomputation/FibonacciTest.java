package com.algoruntimeanalysis.fibonaccicomputation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FibonacciTest {
    @Test
    public void fibonacciTestForIterative(){
        assertEquals(0, IterativeFibonacciSeries.fibonacciIterative(0));
        assertEquals(1, IterativeFibonacciSeries.fibonacciIterative(1));
        assertEquals(1, IterativeFibonacciSeries.fibonacciIterative(2));
        assertEquals(2, IterativeFibonacciSeries.fibonacciIterative(3));
        assertEquals(3, IterativeFibonacciSeries.fibonacciIterative(4));
        assertEquals(5, IterativeFibonacciSeries.fibonacciIterative(5));
        assertEquals(8, IterativeFibonacciSeries.fibonacciIterative(6));

        System.out.println("Passed!!");
    }

    @Test
    public void fibonacciTestForRecursion(){
        assertEquals(0, RecursiveFibonacciSeries.fibonacciRecursive(0));
        assertEquals(1, RecursiveFibonacciSeries.fibonacciRecursive(1));
        assertEquals(1, RecursiveFibonacciSeries.fibonacciRecursive(2));
        assertEquals(2, RecursiveFibonacciSeries.fibonacciRecursive(3));
        assertEquals(3, RecursiveFibonacciSeries.fibonacciRecursive(4));
        assertEquals(5, RecursiveFibonacciSeries.fibonacciRecursive(5));
        assertEquals(8, RecursiveFibonacciSeries.fibonacciRecursive(6));

        System.out.println("Passed!!");
    }

    @Test
    public void testPerformance(){
        int number =40;
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

        assertTrue(totalTimeByIterative<totalTimeByRecursion);
        System.out.println("Recursive approach is infeasible for large values of N due to exponential growth.\n" +
                "The iterative approach is significantly faster and memory-efficient.");
    }

}
