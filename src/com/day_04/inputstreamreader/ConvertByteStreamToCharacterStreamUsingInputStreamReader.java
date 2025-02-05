/*InputStreamReader Problem 1: Convert Byte Stream to Character Stream Using InputStreamReader
Problem:
Write a program that uses InputStreamReader to read binary data from a file and print it as characters. The file contains data encoded in a specific charset (e.g., UTF-8).
Approach:
Create a FileInputStream object to read the binary data from the file.
Wrap the FileInputStream in an InputStreamReader to convert the byte stream into a character stream.
Use a BufferedReader to read characters efficiently from the InputStreamReader.
Read the file line by line and print the characters to the console.
Handle any encoding exceptions as needed.
*/
package com.day_04.inputstreamreader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertByteStreamToCharacterStreamUsingInputStreamReader {
    public static void main(String[] args) {

        //Try block
        try (FileInputStream fileInputStream = new FileInputStream("D:\\Capzeminin_Training\\Week_03\\Day-04\\src\\com\\day_04\\inputstreamreader\\Problem01.txt");
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"UTF-8") ){
            int ch;
            while((ch = inputStreamReader.read()) != -1){
                System.out.print((char) ch);
            }
        }
        //Returning exception if it occurs
        catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
