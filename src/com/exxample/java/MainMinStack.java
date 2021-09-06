package com.exxample.java;

import java.util.Stack;

public class MainMinStack {
	public static void main(String[] args) {
		MinStackWithTwoStack minStack = new MinStackWithTwoStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin()); // return -3
		minStack.pop();
		System.out.println(minStack.top()); // return 0
		System.out.println(minStack.getMin()); // return -2
	}
}

class MinStackWithOneStack{
	Stack<int[]> stack = new Stack<int[]>();
	public MinStackWithOneStack() {}
	
	public void push(int x) {
		if(stack.isEmpty()) {
			stack.push(new int[] {x,x});
			return;
		}
		int currentMin = stack.peek()[1];
		stack.push(new int[] {x, Math.min(currentMin, x)});
			
	}
	
	public void pop() {
		stack.pop();
	}
	
	public int top() {
		return stack.peek()[0];
    }
	    
	public int getMin() {
		return stack.peek()[1];
    }
}

class MinStackWithTwoStack{
	Stack<Integer> stack = new Stack<Integer>();
	Stack<Integer> minValue = new Stack<Integer>();
	public MinStackWithTwoStack() {}
	
	public void push(int x) {
		if(minValue.isEmpty() || x <= minValue.peek()) 
			minValue.push(x);
		stack.push(x);
	}
	
	public void pop() {
		if(minValue.peek().equals(stack.peek()))
			minValue.pop();
		stack.pop();
	}
	
	public int top() {
		return stack.peek();
    }
	    
	public int getMin() {
		return minValue.peek();
    }
}