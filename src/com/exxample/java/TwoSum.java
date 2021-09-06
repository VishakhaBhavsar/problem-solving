package com.exxample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		System.out.println(twoSum(nums));
	}
	
	public static List<List<Integer>> twoSum(int[] nums) {
		
		Set<List<Integer>> result = new HashSet<>();
		Arrays.sort(nums);
		int i = 0;
		int j = nums.length - 1;
		while(i < j) {
			int sum = nums[i] + nums[j];
			if(sum == 0) {
				List<Integer> list = new ArrayList<>();
				list.add(nums[i++]);
				list.add(nums[j--]);
				result.add(list);
			} else if (sum < 0) 
				i++;
			else if(sum > 0)
				j--;
		}
		return new ArrayList<>(result);	
	}

}
