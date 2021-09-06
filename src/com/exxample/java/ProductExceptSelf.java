package com.exxample.java;

public class ProductExceptSelf {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		productExceptSelf(nums);
		System.out.print("{");
		for(int i = 0; i < nums.length; i++)
			System.out.print(" " + nums[i]);
		System.out.print("}");

	}
	
	public static int[] productExceptSelf(int[] nums){
		
		int[] a1 = new int[nums.length];
		int[] b1 = new int[nums.length];
		
		a1[0] = 1;
		b1[nums.length - 1] = 1;
		
		for(int i = 0; i < nums.length - 1; i++) 
			a1[i+1] = a1[i] * nums[i]; 
		
		for(int j = nums.length - 1; j > 0; j--) 
			b1[j-1] = b1[j] * nums[j];
		
		for(int i = 0; i < nums.length; i++) 
			nums[i] = a1[i] * b1[i];
		
		return nums;	
	}
}
