package com.exxample.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostCommonWord {

	public static void main(String[] args) {

		String para = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		
		System.out.println(mostCommonWord(para, banned));
		
	}
	
	 public static String mostCommonWord(String paragraph, String[] banned) {
	        List<String> bannedWords = Arrays.asList(banned);
	        paragraph = paragraph.toLowerCase();
	        HashMap<String, Integer> table = new HashMap<>();
	        
	        for(String word: paragraph.split(" ")){
	            word = word.contains("!") ? word.split("!")[0] : word;
	            word = word.contains("?") ? word.split("\\?")[0] : word;
	            word = word.contains("'") ? word.split("'")[0] : word;
	            word = word.contains(",") ? word.split(",")[0] : word;
	            word = word.contains(";") ? word.split(";")[0] : word;
	            word = word.contains(".") ? word.split("\\.")[0] : word;
	            
	            if(!bannedWords.contains(word)){
	                int count = table.getOrDefault(word, 0);
	                table.put(word, ++count);
	            }
	        }
//	        int maxCount=0;
//	        String result="";
//	        for(String word: table.keySet()){
//	            if(table.get(word) > maxCount){
//	                maxCount = table.get(word);
//	                result = word;
//	            }
//	        }
//	        return result;
	        
	        Set<Entry<String, Integer>> entrySet = table.entrySet();
	        return entrySet.stream()
	        .max(Map.Entry.comparingByValue())
	        .map(Entry::getKey)
	        .get();
	        
//	        Collections.max(table.entrySet(), Map.Entry.comparingByValue()).getKey()
	        
	    }

}
