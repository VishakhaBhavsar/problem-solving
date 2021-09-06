package com.exxample.java;

import java.util.HashMap;

public class MinWindowSubString {

	public static void main(String[] args) {
		String s = "aa";
		String t = "aa";
		System.out.println(minWindow(s, t));

	}

	public static String minWindow(String s, String t) {
		
		if(s.length() == 0 || s.length() < t.length())
			return " ";
		
        int slidingPointer = 0;
        int fixedPointer = 0;
        int count = 0;
        int length = 0;
        int start = 0;
        int min = Integer.MAX_VALUE;
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char ch: t.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        while(slidingPointer < s.length()){
        	if(map.containsKey(s.charAt(slidingPointer))) {
                map.put(s.charAt(slidingPointer), map.get(s.charAt(slidingPointer)) - 1);
                if(map.get(s.charAt(slidingPointer)) >= 0)
                	count++;
        	}            
            while(count == t.length()){
            	length = slidingPointer - fixedPointer + 1;
            	if(min > length){
            		min = length;
            		start = fixedPointer;
            	} 
               
            	if(map.containsKey(s.charAt(fixedPointer))) {
            		map.put(s.charAt(fixedPointer),map.get(s.charAt(fixedPointer))+ 1);
            		if(map.get(s.charAt(fixedPointer)) > 0)
            			count--;
            	}
            	fixedPointer++;
        	}
            slidingPointer++;
        }
        if(min > s.length())
        	return "";
        String substring = s.substring(start, min + start);
        return substring;
    }
}
