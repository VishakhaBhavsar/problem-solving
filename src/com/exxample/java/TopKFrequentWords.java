package com.exxample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TopKFrequentWords {

	public static void main(String[] args) {
		String[] words = new String[] {"i", "love", "leetcode", "i", "love", "coding"};
		System.out.println(topKFrequent(words, 1));

	}
	
	public static List<String> topKFrequent(String[] words, int k) {
		List<String>[] bucket = new List[words.length + 1];
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String str: words) 
			map.put(str, map.getOrDefault(str, 0) + 1);
		
		for(String key: map.keySet()) {
			int frequency = map.get(key);
			if(bucket[frequency] == null) 
				bucket[frequency] = new ArrayList<String>();
			bucket[frequency].add(key);
			Collections.sort(bucket[frequency]);
		}
		
		int count = 0;
		List<String> res = new ArrayList<>();
		for(int i = bucket.length - 1; i >= 0; i--) {
			if(bucket[i] != null) {
				for(int j = 0; j < bucket[i].size(); j++) {
					res.add(bucket[i].get(j));
					count++;
					if(count == k)
						return res;
				}
			}
		}
		return res;
	}
}
