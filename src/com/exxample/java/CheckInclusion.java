package com.exxample.java;

import java.util.HashMap;

public class CheckInclusion {

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidboaoo";
		System.out.println(checkInclusion(s1, s2));

	}
	
    public static boolean checkInclusion(String s1, String s2) {
    	if(s1.length() > s2.length())
            return false;
        HashMap<Character, Integer> s1table = new HashMap<>();
        for(int i = 0; i < s1.length(); i++)
            s1table.put(s1.charAt(i), s1table.getOrDefault(s1.charAt(i), 0) + 1);
        
        for(int i = 0; i <= s2.length() - s1.length(); i++){
            HashMap<Character, Integer> s2table = new HashMap<>();
            for(int j = 0; j < s1.length(); j++){
                s2table.put(s2.charAt(i+j), s2table.getOrDefault(s2.charAt(i+j), 0) + 1);
            }
            if(matches(s1table, s2table))
                return true;
        }
        return false;
    }
    
    public static boolean matches(HashMap < Character, Integer > s1table, HashMap < Character, Integer > s2table) {
    	for(char key: s1table.keySet()){
            if(s1table.get(key) - s2table.getOrDefault(key, -1) != 0)
                return false;
        }
        return true;
    }
}



