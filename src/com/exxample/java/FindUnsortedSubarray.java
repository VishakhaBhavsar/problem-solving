package com.exxample.java;

public class FindUnsortedSubarray {

	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(findUnsortedSubarray(nums));
	}
	
	public static int findUnsortedSubarray(int[] nums) {
        int indexmin = 0, indexmax = 0;
        int min = nums[0], max = nums[0];
        for(int i = 0; i < nums.length; i++) {
        	if(nums[i] < min) {
        		min = nums[i];
        		indexmin = i;
        	}
        	if(nums[i] > max) {
        		max = nums[i];
        		indexmax = i;
        	}
        }
        return indexmax;
	}    
	
}
