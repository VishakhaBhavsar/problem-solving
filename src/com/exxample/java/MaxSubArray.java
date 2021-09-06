package com.exxample.java;

public class MaxSubArray {

	public static void main(String[] args) {
		int[] nums = {2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		int currSum = nums[0];
		int maxSum = nums[0];
		for(int i = 1; i < nums.length; i++) {
			currSum = Math.max(currSum + nums[i], nums[i]);
			maxSum = Math.max(maxSum, currSum);
		} 
		return maxSum;
	}
}
