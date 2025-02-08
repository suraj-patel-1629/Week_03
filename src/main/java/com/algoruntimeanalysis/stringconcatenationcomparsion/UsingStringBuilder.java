package com.algoruntimeanalysis.stringconcatenationcomparsion;

class UsingStringBuilder {
    // method to add java word into string up to length
    public static void stringBuilderConcate(int length){
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<length;i++){
            sb.append("s");
        }
    }
}
