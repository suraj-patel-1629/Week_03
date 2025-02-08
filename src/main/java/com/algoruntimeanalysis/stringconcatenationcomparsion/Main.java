/*Compare the performance of String (O(N²)), StringBuilder (O(N)), and StringBuffer (O(N)) when concatenating a million strings.
Approach:
Using String (Immutable, creates new object each time)
Using StringBuilder (Fast, mutable, thread-unsafe)
Using StringBuffer (Thread-safe, slightly slower than StringBuilder)
Comparative Analysis:
Operations Count (N)
String (O(N²))
StringBuilder (O(N))
StringBuffer (O(N))
1,000
10ms
1ms
2ms
10,000
1s
10ms
12ms
1,000,000
30m (Unusable)
50ms
60ms

*/
package com.algoruntimeanalysis.stringconcatenationcomparsion;



import static com.algoruntimeanalysis.stringconcatenationcomparsion.UsingString.stringConcate;
import static com.algoruntimeanalysis.stringconcatenationcomparsion.UsingStringBuffer.stringBufferConcate;
import static com.algoruntimeanalysis.stringconcatenationcomparsion.UsingStringBuilder.stringBuilderConcate;

public class Main {
    public static void main(String[] args) {

    int size[]={1000,10000,1000000};

    for(int i=0;i<size.length;i++){
        long startTime = System.nanoTime();
        stringConcate(size[i]);
        // storing end time
        long endTime = System.nanoTime();
        // printing time taken by linear search
        System.out.println("Time taken by using String : " + (endTime - startTime) / 1000000.0 + " ms");

        startTime = System.nanoTime();
        stringBufferConcate(size[i]);
        // storing end time
        endTime = System.nanoTime();
        // printing time taken by linear search
        System.out.println("Time taken by using StringBuffer : " + (endTime - startTime) / 1000000.0 + " ms");

        startTime = System.nanoTime();
        stringBuilderConcate(size[i]);
        // storing end time
        endTime = System.nanoTime();
        // printing time taken by linear search
        System.out.println("Time taken by using StringBuilder : " + (endTime - startTime) / 1000000.0 + " ms");
        System.out.println("********************************************************************************");


    }




    }
}
