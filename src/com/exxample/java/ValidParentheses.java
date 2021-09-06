package com.exxample.java;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		System.out.println(isValid("{[]}"));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(char ch: s.toCharArray()) {
			if(ch == '(' || ch == '{' || ch == '[')
				stack.push(ch);
			else if(ch == ')' && !stack.isEmpty() && stack.peek() == '(')
				stack.pop();
			else if(ch == '}' && !stack.isEmpty() && stack.peek() == '{')
				stack.pop();
			else if(ch == ']' && !stack.isEmpty() && stack.peek() == '[')
				stack.pop();
			else
				return false;
		}
		
		return stack.isEmpty();
	}
}
