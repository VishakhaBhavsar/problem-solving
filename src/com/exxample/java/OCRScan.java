package com.exxample.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OCRScan {

	public static void main(String[] args) {
		System.out.println("expect true = "+solution("A2Le3", "2pL4"));
		System.out.println("expect true = "+solution("A2Le", "2pL1"));
		System.out.println("expect true = "+solution("a10", "10a"));
		System.out.println("expect false = "+solution("ba1", "1Ad"));
		System.out.println("expect false = "+solution("3x2x", "8"));
	}
	
	public static boolean solution(String S, String T) {
		
		S = expandNumbers(S);
		T = expandNumbers(T);
		
		if(S.length() != T.length())
			return false;
		
		for(int i = 0; i< S.length(); i++) {
			if('?' == S.charAt(i) || '?' == T.charAt(i)) 
				continue;
			if(S.charAt(i) != T.charAt(i))
				return false;
		} 
		return true;
    }
	
	public static String expandNumbers(String s) {
		
		Pattern pattern = Pattern.compile("\\d+");
		Matcher m = pattern.matcher(s);
		
		while(m.find()) {
			s = m.replaceFirst(generateQs(m.group()));
			m = pattern.matcher(s);
		}		
		return s;
	}
	
	public static String generateQs(String num) {
		String s = "";
		int n = Integer.valueOf(num);
		for(int i=0; i < n; i++) 
			s = s.concat("?");
		return s;
	}
}
