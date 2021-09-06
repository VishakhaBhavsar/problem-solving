package com.exxample.java;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(-120));
	}
	
	public static int reverse(int x) {
		
		boolean negative = false;
		if(x < 0) {
			negative = true;
			x = (-1) * x;
		}

		long reversed = 0;
		
		while(x > 0) {
			reversed = (reversed * 10) + (x % 10);
			x = x / 10;
		}
		if(reversed > Integer.MAX_VALUE) 
			return 0;
		
		return negative ? (int)((-1) * reversed) : (int)reversed;
	
	}
}
