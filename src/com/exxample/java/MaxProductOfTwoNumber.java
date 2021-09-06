package com.exxample.java;

import java.util.Arrays;

public class MaxProductOfTwoNumber {

	public static void main(String[] args) {
		
		int[] nums = new int[] {-20, -10, 3, 9, -8};
		System.out.println(solution(nums));
	}

	public static int solution(int[] nums) {
		Arrays.sort(nums);
		
		return Math.max(nums[0] * nums[1], nums[nums.length - 1] * nums[nums.length - 2]);
	}
}
