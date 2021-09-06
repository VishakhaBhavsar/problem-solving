package com.exxample.java;
public class IsInterleave {
	public static void main(String[] args) {
		System.out.println(isInterleave("aabcc", "dbbca", "aadbbbaccc"));
	}
	
	public static boolean isInterleave(String s1, String s2, String s3) {
		if(s1.length() + s2.length() != s3.length())
			return false;
		return check(s1, s2, s3, 0, 0, 0);
	}
	
	public static boolean check(String s1, String s2, String s3, int p1, int p2, int p3) {
		if(p3 == s3.length()) 
			return (p1 == s1.length() && p2 == s2.length()) ? true : false;
		
		
		if(p1 != s1.length()) {
			if(s1.charAt(p1) == s3.charAt(p3)) {
				boolean flag = check(s1, s2, s3, p1+1 , p2, p3+1);
				if(flag)
					return true;
			}
		}
		
		if(p2 != s2.length()) {
			if(s2.charAt(p2) == s3.charAt(p3)) {
				boolean flag = check(s1, s2, s3, p1, p2+1, p3+1);
				if(flag)
					return true;
			}
		}
		return false;
	}
}
