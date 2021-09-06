package com.exxample.java;

import java.util.Arrays;

public class MinMoves {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3};
		System.out.println(minMoves(nums));

	}
	
	public static int minMoves(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        for(int i = 1; i < nums.length; i++) {
        	moves += nums[i] - nums[0];
        }
        return moves;
    }

}
