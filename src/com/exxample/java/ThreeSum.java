package com.exxample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {3,0,-2,-1,1,2};
		System.out.println(threeSum(nums));
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		
		Set<List<Integer>> result = new HashSet<>();
		Arrays.sort(nums);
		for(int i = 0; i < nums.length -2; i++) {
			int j = i+1;
			int k = nums.length - 1;
			int sum = -(nums[i]);
			while(j < k) {
				int resultSum = nums[j] + nums[k];
				if(resultSum == sum) 
					result.add(Arrays.asList (nums[i], nums[j++], nums[k--]));
				else if(resultSum < sum)
					j++;
				else if(resultSum > sum)
					k --;
			}
		}
		return new ArrayList<>(result);	
		}
	}
