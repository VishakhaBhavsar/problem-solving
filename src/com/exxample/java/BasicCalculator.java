package com.exxample.java;

import java.util.Arrays;
import java.util.Stack;

public class BasicCalculator {

	public static void main(String[] args) {
		System.out.println(Calculator("(1+(4+5+2)-3)+(6+8)"));

	}

	public static int Calculator(String s) {
		Stack<Character> stack = new Stack<>();
		int sum = 0;
		
		String sb = "";
		for(int i = s.length() - 1; i >= 0; i++) {
			sb += s.charAt(i);
		}
		
		for(int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == ')') {
				stack.push(sb.charAt(i));
			}
			
			while(!stack.isEmpty()) {
				
			}
		}
		
		return sum;
	}
}
