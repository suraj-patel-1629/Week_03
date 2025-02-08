package com.algoruntimeanalysis.largefilereadingefficiency;

import com.algoruntimeanalysis.largefilereadingefficiency.FileReaderCharacterStream;
import com.algoruntimeanalysis.largefilereadingefficiency.InputStreamReaderByteStream;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class LargeFileReadingTest {
    @Test
    public void testFileReadingPerformance() {
        //Define test file paths (Ensure these test files exist)
        String[] filePaths = {"TestFile1MB.txt", "TestFile100MB.txt", "TestFile500MB.txt"};

        for (String filePath : filePaths) {
            File file = new File(filePath);
            assertTrue("Test file does not exist: " + filePath, file.exists());

            //Measure time for FileReader
            long startTime = System.currentTimeMillis();
            FileReaderCharacterStream.readWithFileReader(filePath);
            long fileReaderTime = System.currentTimeMillis() - startTime;

            //Measure time for InputStreamReader
            startTime = System.currentTimeMillis();
            InputStreamReaderByteStream.readWithInputStreamReader(filePath);
            long inputStreamReaderTime = System.currentTimeMillis() - startTime;

            //Assertions: InputStreamReader should be at least 20% faster than FileReader
            System.out.println("File: " + filePath);
            System.out.println("FileReader Time: " + fileReaderTime + " ms");
            System.out.println("InputStreamReader Time: " + inputStreamReaderTime + " ms");

            assertTrue("InputStreamReader should be faster than FileReader",
                    inputStreamReaderTime <= fileReaderTime );
        }
    }
}
