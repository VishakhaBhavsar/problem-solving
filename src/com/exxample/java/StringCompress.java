package com.exxample.java;

public class StringCompress {

	public static void main(String[] args) {
		char chars[] = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
		System.out.println("\n" + compress(chars));
	}
	
	public static int compress(char[] chars) {
		int i = 0;
		int index = 0;
		while(i < chars.length) {
			int j = i;
			while(j < chars.length && chars[i] == chars[j])
				j++;
			
			chars[index++] = chars[i];
			if(j - i > 1) {
				String count = j - i + "";
				for(char c: count.toCharArray())
					chars[index++] = c;
			}
			i = j;
		}
		for(int k = 0; k < index; k++)
			System.out.print(chars[k]);
		return index;	
	}
}
