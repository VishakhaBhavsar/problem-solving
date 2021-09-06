package com.exxample.java;

public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(reverseWords("Let's take LeetCode contest"));
	}
	
	public static String reverseWords(String str) {
		char s[] = str.toCharArray();
        int start = 0;
        int end = 0;
        while(end < s.length){
            if(s[end] == ' '){
                reverse(s, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        reverse(s, start, s.length-1);
        
        return new String(s);
    }
    
    public static void reverse(char[] s, int start, int end){
        while(start <= end){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
