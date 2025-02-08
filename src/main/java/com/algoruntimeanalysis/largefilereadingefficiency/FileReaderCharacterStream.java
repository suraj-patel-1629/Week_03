package com.algoruntimeanalysis.largefilereadingefficiency;

import java.io.FileReader;
import java.io.IOException;
//class to reading file by file reader
public class FileReaderCharacterStream {
    //method to read file
    public static void readWithFileReader(String filePath){
        try(FileReader fr = new FileReader(filePath)){
            int character;
            while((character = fr.read()) != -1) {
                //Reading character by character
            }
        }catch(IOException e){
            //throw exception if not find
            System.out.println("Error: " + e.getMessage());
        }
    }
}
