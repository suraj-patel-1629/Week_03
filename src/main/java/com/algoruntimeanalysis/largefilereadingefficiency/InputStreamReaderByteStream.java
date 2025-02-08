package com.algoruntimeanalysis.largefilereadingefficiency;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
//class to read file by input stream
public class InputStreamReaderByteStream {
    //method to read file by input stream
    public static void readWithInputStreamReader(String filePath){
        //handle exception if file is not available
        try(InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filePath))) {
            int character;
            //read the character continue
            while((character = inputStreamReader.read()) != -1) {
                // Reading character by character
            }
            //throw exception if any error during reading
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
