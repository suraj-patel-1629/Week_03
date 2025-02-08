package com.algoruntimeanalysis.stringconcatenationcomparsion;

 class UsingStringBuffer {
     // method to add java word into string up to length
     public static void stringBufferConcate(int length){
         StringBuffer sb = new StringBuffer("");
         for(int i=0;i<length;i++){
             sb.append("s");
         }
     }
}
