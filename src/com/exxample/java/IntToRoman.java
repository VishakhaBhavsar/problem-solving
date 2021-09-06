package com.exxample.java;

public class IntToRoman {
	
	static int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	static String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

	public static void main(String[] args) {
		System.out.println(intToRoman(9999));

	}

	public static String intToRoman(int nums) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < values.length && nums >= 0; i++) {
			while(values[i] <= nums) {
				nums -= values[i];
				sb.append(symbols[i]);
			}
		}
		return sb.toString();
	}	
}
