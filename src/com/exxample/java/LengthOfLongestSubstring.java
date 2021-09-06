package com.exxample.java;
import java.util.HashSet;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		
		System.out.println(lengthOfLongestSubstring("pwwkew"));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		
			int max = 0;
			int fixedPointer = 0;
			int slidingPointer = 0;
			
			HashSet<Character> set = new HashSet<Character>();
			
			while(slidingPointer < s.length()) {
				if(!set.contains(s.charAt(slidingPointer))) {
					set.add(s.charAt(slidingPointer));
					slidingPointer++;
					max = Math.max(set.size(), max);
				} else {
					set.remove(s.charAt(fixedPointer));
					fixedPointer++;
				}
			}
			return max;
	}
}
