package com.exxample.java;

import java.util.Arrays;
import java.util.HashMap;

public class FirstUniqChar {

	public static void main(String[] args) {
		System.out.println(firstUniqChar("leetcode"));
		
	}
	public static int firstUniqChar(String s) {
		HashMap< Character, Integer> table =  new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++) {
			table.put(s.charAt(i), table.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		for (int i = 0; i <s.length(); i++) {
			if(table.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		
		
		return -1;
	}
}
