package com.exxample.java;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums = new int[] {1};
		System.out.println(search(nums, 0));	
	}
	
	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			
			if(nums[mid] == target)
				return mid;
			
			if(nums[start] <= nums[mid]) {
				if(nums[start] <= target && target <= nums[mid]) 
					end = mid - 1;
				else
					start = mid + 1;
			} else {
				if(nums[mid] <= target && target <= nums[end])
					start = mid + 1;
				else
					end = mid - 1;
			}
		}
		
		return -1;
	}

}
