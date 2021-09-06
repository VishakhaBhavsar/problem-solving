package com.exxample.java;

import java.util.HashMap;

public class SubArraySum {

	public static void main(String[] args) {
		int[] nums = new int[]{2,2,2};
		System.out.println(subarraySum(nums, 6));

	}
	
	public static int subarraySum(int[] nums, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		int count = 0;
		map.put(0,1);
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if(map.containsKey(sum - k)) 
				count += map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

}
