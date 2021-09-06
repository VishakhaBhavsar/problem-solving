package com.exxample.java;

public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(30));
	}
	
	public static String countAndSay(int n) {	
		String newDigit = "";
		if(n == 1) return "1";
		
		newDigit = generateSequence("1");
		for(int i = 2; i < n; i++)
			newDigit = generateSequence(newDigit);
		
       return newDigit;
    }
		
	public static String generateSequence(String n) {
		String num = n;
        String newDigit = "";
        int count = 0;
        for(int i = 0; i < num.length() - 1; i++) {
        	if(num.charAt(i) == num.charAt(i+1))
        		count++;
        	else {
        		newDigit = newDigit.concat(String.valueOf(count+1)).concat(String.valueOf(num.charAt(i)));
        		count = 0;
        	}
        }
        newDigit = newDigit.concat(String.valueOf(count+1)).concat(String.valueOf(num.charAt(num.length() - 1)));
        return newDigit;
	}
}
	
	
