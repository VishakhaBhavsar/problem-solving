package com.exxample.java;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] strs = {"ab", "a"};
		System.out.println(longestCommonPrefix(strs));

	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		String result = "";
		if(strs == null || strs.length == 0) {
			return result;
		}
		
		int index = 0;
		for(char c: strs[0].toCharArray()) {
			for (int i = 1; i < strs.length; i++) {
				if(index >= strs[i].length() || c != strs[i].charAt(index)) 
					return result;
			}
			result += c;
			index++;
		}		
		return result;
    }
}
