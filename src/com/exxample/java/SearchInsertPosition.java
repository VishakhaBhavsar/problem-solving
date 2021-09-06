package com.exxample.java;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(searchInsert(nums, 0));
	}
	
	public static  int searchInsert(int[] nums, int target) {
	    int index = 0;
	    for (int i = 0; i < nums.length; i++) {
	    	if(nums[i] == target) 
	    		index = i;
	    	else if(target > nums[i] && i == nums.length-1) 
	    		index = i+1; 
	    	else if(target > nums[i] && target < nums[i+1])
	    		index = i+1;
	    	else if(target > nums[i] && i == 0) 
	    		index = i; 
	    }
	    return index;
	}
}
