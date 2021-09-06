package com.exxample.java;

public class TwoConsecutiveNumberAddition {

	public static void main(String[] args) {
		
		int[] nums = {10, -2, 5, 6, -5};
		System.out.println(maxTwoConsecutiveNumberAddition(nums));
		
	}
	
	public static int maxTwoConsecutiveNumberAddition(int[] nums) {
		int max = Integer.MIN_VALUE;
		for(int i = 1; i < nums.length; i++) {
			int res = nums[i-1] + nums[i];
			max = Math.max(max, res);
		}
		return max;
	}

}
