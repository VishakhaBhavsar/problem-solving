package com.exxample.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {

	public static void main(String[] args) {
		System.out.println(letterCombinations("2468"));
	}
	
	public static List<String> letterCombinations(String digits) {
		List<String> combinations = new ArrayList<>(); 
		HashMap<Character, String> mapping = new HashMap<>();
		mapping.put('2',"abc");
		mapping.put('3',"def");
		mapping.put('4',"ghi");
		mapping.put('5',"jkl");
		mapping.put('6',"mno");
		mapping.put('7',"pqrs");
		mapping.put('8',"tuv");
		mapping.put('9',"wxyz");
		
		backTracking(digits, mapping, combinations, 0, new StringBuilder());
		return combinations;
	}
	
	public static void backTracking(String digits, HashMap<Character, String> mapping, List<String> combinations, int index, StringBuilder sb) {
		
		if(index == digits.length()) {
			combinations.add(sb.toString());
			return;
		}
		
		String curr = mapping.get(digits.charAt(index));
		for(int i = 0; i < curr.length(); i++) {
			sb.append(curr.charAt(i));
			backTracking(digits, mapping, combinations, index + 1, sb);
			sb.deleteCharAt(sb.length() - 1);
		}
	}

}
