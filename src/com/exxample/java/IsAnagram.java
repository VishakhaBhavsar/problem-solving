
package com.exxample.java;

import java.util.Arrays;
import java.util.HashMap;

public class IsAnagram {

	public static void main(String[] args) {
		System.out.println(isAnagramSort("anagram", "nagaram"));
		System.out.println(isAnagramSort("rat", "car"));
	}
	
	public static boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> table = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++)
            table.put(s.charAt(i), table.getOrDefault(s.charAt(i), 0) + 1);
        
        for (int i = 0; i < t.length(); i++){
            if(!table.containsKey(t.charAt(i)))
                return false;
            else
                table.put(t.charAt(i), table.get(t.charAt(i)) - 1);
        }
        
        for(char key: table.keySet())
            if(table.get(key) == 0)
                continue;
            else
                return false;
        
        return true;
    }
	
	public static boolean isAnagramSort(String s, String t) {
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		
		Arrays.sort(sChar);
		Arrays.sort(tChar);
		
		if(Arrays.equals(sChar, tChar))
			return true;
		else
			return false;
	}
}
