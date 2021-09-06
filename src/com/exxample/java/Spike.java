package com.exxample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Spike {

	public static void main(String[] args) {
		int[] nums = new int[] {2, 5, 3, 2, 4, 1};
		System.out.println(spikePK(nums));

	}

	public static int spike(int[] nums) {
		int count = 0;
		Map<Integer, Integer> map =new HashMap<>();
		for(int n: nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet())
		{
		        int value = entry.getValue();
		        count += (value < 2 ? value : 2);
		}
		return count;
	}
	
	
	public static int spikePK (int[] nums) {
		
		int count = 0;
		int rt = 0, lt = 0;
		
		ArrayList<Integer> numberList = IntStream.of(nums).boxed()
				.collect(Collectors.toCollection(ArrayList::new));
		
		Collections.sort(numberList, Collections.reverseOrder());
		
		for(int i=0; i < numberList.size(); i++) {
			if(i == 0) {
				rt = numberList.get(i);
				lt = numberList.get(i);
				count++;
			}else {
				if(lt > numberList.get(i)) {
					lt = numberList.get(i);
					count++;
				}else if(rt > numberList.get(i)) {
					rt = numberList.get(i);
					count++;
				}
			}
		}
		return count;
	}
}
