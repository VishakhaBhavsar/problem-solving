package com.exxample.java;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s ="acbbdc";
		System.out.println(longestPalindromeOptimal(s));
	}
	
	public static String longestPalindromeOptimal(String s) {
		if(s == null || s.length() < 0) 
			return "";
		
		int start = 0;
		int end = 0;
		
		for(int i = 0; i < s.length(); i++) {
			int len1 = expandFromMiddle(s, i, i);
			int len2 = expandFromMiddle(s, i, i + 1);
			int len = Math.max(len1, len2);
			if(len > end - start) {
				start = i - ((len - 1) / 2);
				end = i + (len / 2);
			}
		}
		return s.substring(start, end + 1);	
	}
	
	public static int expandFromMiddle(String s, int left, int right) {
		if(s.length() == 0 || left > right)
			return 0;
		
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}
	

	public static String longestPalindrome(String s) {
        char[] characters = s.toCharArray();
        int max = 0;
        int startindex = 0;
        int endindex = 0;
        for(int i = 0; i < characters.length-1; i++){ 
            for(int j = characters.length-1; j > i && max < (j-i+1); j--){
                if(isdPali(characters, i, j)){
                    max = j-i+1;
                    startindex = i;
                    endindex = j;
                    break;
                }
            }
        }
        String substring = "";
        for(int k = startindex; k <= endindex; k++)
            substring += characters[k]; 
        return substring;
    }
 
    public static boolean isdPali(char[] characters, int i, int j){
        while(i <= j){
            if(characters[i] != characters[j])
                return false;
            i++;
            j--;
        }
        return true;
    }
}
