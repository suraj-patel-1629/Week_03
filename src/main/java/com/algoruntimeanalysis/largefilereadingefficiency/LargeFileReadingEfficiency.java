//Problem Statement: Large File Reading Efficiency
//Objective:
//Compare FileReader (Character Stream) and InputStreamReader (Byte Stream) when reading a large file (500MB).
//Approach:
//FileReader: Reads character by character (slower for binary files).
//InputStreamReader: Reads bytes and converts to characters (more efficient).
//Comparative Analysis:
//File Size
//FileReader Time
//InputStreamReader Time
//Expected Result:
//InputStreamReader is more efficient for large files.
//FileReader is preferable for text-based data.
package com.algoruntimeanalysis.largefilereadingefficiency;

public class LargeFileReadingEfficiency {
    public static void main(String[] args) {
        //path of the different size file
        String []filePaths={"TestFile1MB.txt", "TestFile100MB.txt", "TestFile500MB.txt"};
        //tracking the size of the file
        int []fileSize={1,100,500};
        int idx=0;
        //iterate over different file path
        for(String filePath : filePaths ){
            //Time Duration for File Reader CharacterStream
            long startTime= System.currentTimeMillis();
            FileReaderCharacterStream.readWithFileReader(filePath);
            long totalTimeForFileReader = System.currentTimeMillis() - startTime;

            //Time Duration for InputStream Reader ByteStream
            startTime = System.currentTimeMillis();
            InputStreamReaderByteStream.readWithInputStreamReader(filePath);
            long totalTimeForInputStreamReader = System.currentTimeMillis() - startTime;

            //Displaying the result
            System.out.println("File size: "+ fileSize[idx]+ " MB");
            System.out.println("Total time for file reading by File Reader: "+ totalTimeForFileReader/1000.0 + " S");
            System.out.println("Total time for file reading by Input Stream Reader: "+ totalTimeForInputStreamReader/1000.0+ " S");
            System.out.println("**************************************************************************************************");
            idx++;
        }
    }
}
