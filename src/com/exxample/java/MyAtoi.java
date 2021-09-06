package com.exxample.java;

public class MyAtoi {

	public static void main(String[] args) {
		System.out.println(myAtoi("    "));
	}

	public static int myAtoi(String s) {
       
		if(s == null || s.isEmpty())
			return 0;
		int sign = 1;
		int i = 0;
		while(i < s.length() && s.charAt(i) == ' ')
			i++;
		if(i >= s.length())
			return 0;	
		if(s.charAt(i) == '+' || s.charAt(i) == '-')
			sign = s.charAt(i++) == '+' ? 1 : -1;
		long res = 0;
		while(i < s.length() && Character.isDigit(s.charAt(i))) {
			res = (res * 10) + (s.charAt(i++) - '0');
			if(res * sign > Integer.MAX_VALUE || res * sign < Integer.MIN_VALUE) 
				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
		} 
		return (int) (res * sign);   
    }
}
