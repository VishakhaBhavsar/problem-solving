package com.exxample.java;

public class MoveZero {

	public static void main(String[] args) {
		int nums[] = {0,1,0,3,12,9,0};
		OneMoreWay(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(" " +nums[i]);
		}
	}

	public static void OneMoreWay(int[] nums) {
		int i = 0;
		int index = 0;
		while(i < nums.length) {
			if(nums[i] != 0) 
				nums[index++] =  nums[i];
			i++;
		}
		while(index < nums.length) 
			nums[index++] = 0;
	}
	
	public static void moveZeroesInPlace(int[] nums) {
		int i = 0;
		int index = 0;
		int count = 0;
		while(i < nums.length) {
			if(nums[i] != 0) 
				nums[index++] =  nums[i++];
			else {
				i++;
				count++;
			}
		}
		int j = nums.length - 1 ;
		while(count > 0) {
			nums[j] = 0;
			j--;
			count--;
		}
	}
	
	public static void moveZeroes(int[] nums) {
        int[] newA = new int[nums.length];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                newA[index++] = nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = newA[i];
        }
    }
}
