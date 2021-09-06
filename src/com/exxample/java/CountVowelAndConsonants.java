package com.exxample.java;

import java.util.HashSet;
import java.util.Set;

public class CountVowelAndConsonants {

	public static void main(String[] args) {
		
		String str = "I am happy";
		solution(str);
	}
	
	public static void solution(String str) {
		int countC = 0;
		int countV = 0;
		String vowel = "aeiouy";
		
		str = str.toLowerCase().trim();
		
		for(Character ch: str.toCharArray()) {
			if(vowel.indexOf(ch) != -1)
				countV++;
			else if(ch != ' ')
				countC++;
		}
		
		System.out.println(countV);
		System.out.println(countC);
		
	}

}
