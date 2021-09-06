package com.exxample.java;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums = {-1,2,1,-4};
		System.out.println(threeSumClosest(nums, 1));
	}
	
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int diff = Integer.MAX_VALUE;
		for(int i = 0; i < nums.length - 2; i++) {
			int j = i + 1;
			int k = nums.length - 1;
			
			while(j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if(Math.abs(target - sum) < Math.abs(diff))
					diff = target - sum;
				if(sum > target)
					k--;
				else
					j++;
			}
		} 
		return target-diff;
	}
}
