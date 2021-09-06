package com.exxample.java;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

// Main class should be named 'Solution'
class FileAnalytics {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/Users/vishakhabhavsar/eclipse-workspace/MergeLinkedList/src/com/exxample/java/data.csv")));
        
        String line = "";
        String[] headers = null;
        boolean headerRow = true;
        
        
        while((line = bufferedReader.readLine()) != null) {
        	if(headerRow) {
        		headers = line.split(",");
        		headerRow = false;
        	}else {
                StringTokenizer tokenizer = new StringTokenizer(line, ",");
                
                
                
        	}
        }
    }
}
