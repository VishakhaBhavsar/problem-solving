package com.exxample.java;

import java.util.HashMap;

public class MaxLengthBetweenEqualCharacters {

	public static void main(String[] args) {
		System.out.println(maxLengthBetweenEqualCharacters("abca"));
	}
	
	public static int maxLengthBetweenEqualCharacters(String s) {
		int length = -1;
        HashMap<Character, Integer> map = new HashMap<>();
    
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i)))
                length = Math.max(length, (i - (map.get(s.charAt(i))) - 1));
            else
                map.put(s.charAt(i), i);
            
        }
        return length;
    }
}
