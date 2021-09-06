package com.exxample.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TopKFrequent {

	public static void main(String[] args) {
		int[] res = topKFrequent(new int[] {1}, 1);
		for(int i = 0; i < res.length; i++) {
			System.out.print(" " + res[i]);	
		}
	}
	
	public static int[] topKFrequent(int[] nums, int k) {
		List<Integer>[] bucket = new List[nums.length + 1];
		HashMap<Integer, Integer> map = new  HashMap<>();
		
		for(Integer num: nums) 
			map.put(num, map.getOrDefault(num, 0) + 1);
			
		for(Integer key: map.keySet()) {
			int frequency = map.get(key);
			if(bucket[frequency] == null)
				bucket[frequency] = new ArrayList<>();
			bucket[frequency].add(key);
		}
		
		int count = 0;
		int[] res = new int[k];
		for(int i = bucket.length - 1; i >=0; i--) {
			if(bucket[i] != null){
				for(int j = 0; j < bucket[i].size(); j++) 
					res[count++] = bucket[i].get(j);
			if(count == k)
				break;
			}
		}
		return res;
	}
}
