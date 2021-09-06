package com.exxample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
        
		List<List<String>> groupAnagrams = new ArrayList<List<String>>();
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        for(String current : strs) {
        	char[] characters = current.toCharArray();
        	Arrays.sort(characters);
        	String sorted = new String(characters);
        	if(!map.containsKey(sorted)) 
        		map.put(sorted, new ArrayList<String>());
        	map.get(sorted).add(current);
        }
        groupAnagrams.addAll(map.values());
        return groupAnagrams;
	}
}

	
