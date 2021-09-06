package com.exxample.java;

import java.util.HashMap;

public class RomanToInt {

	public static void main(String[] args) {
		System.out.println(romanToInt("IV"));
	}
	
	public static int romanToInt(String s) {
		
		HashMap<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        
        //int sum = map.get(s.charAt(s.length() - 1));
        int sum = 0;
        for(int i = 0; i < s.length() - 1; i++) {
        	if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
        		sum -= map.get(s.charAt(i));
        	else
        		sum += map.get(s.charAt(i));
        }
        sum += map.get(s.charAt(s.length() - 1));
        return sum;
	}
}
