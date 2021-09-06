package com.exxample.java;

public class RotateArray {

	public static void main(String[] args) {
		int[] nums = {-1,-100,3,99};
		int k = 2;
		rotate(nums, k);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(" " + nums[i]);
		}
	}
	
	public static void rotate(int[] nums, int k) {
		
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}
	
	public static void reverse(int[] nums, int start, int end) {
		
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
