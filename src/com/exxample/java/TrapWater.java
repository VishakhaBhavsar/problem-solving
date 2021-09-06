package com.exxample.java;

public class TrapWater {

	public static void main(String[] args) {
	
		int[] height = {4,2,0,3,2,5};
		System.out.println(trapWaterBruteForce(height));
		System.out.println(trapWaterOptimalWay(height));

	}
	
	public static int trapWaterBruteForce(int[] height) {
		
		int[] leftMax = new int[height.length];
		int[] rightMax = new int[height.length];
		
		int max = 0; 
		int totalWater = 0;
		
		for(int i = 0; i < height.length; i++) {
			max = Math.max(max, height[i]);
			leftMax[i] = max;
		}
		
		max = 0;
		
		for(int i = height.length - 1; i >= 0; i--) {
			max = Math.max(max, height[i]);
			rightMax[i] = max; 
		}
		
		for(int i = 0; i < height.length; i++) {
			int water = Math.min(leftMax[i], rightMax[i]) - height[i];
			totalWater += water;
		}
		return totalWater;
	}
	
	public static int trapWaterOptimalWay(int[] height) {
		int leftMax = 0;
		int totalWater = 0;
		int rightMax = 0;
		int rightIndex = 0;
		
		for(int i = 0; i < height.length; i++) {
			if(rightMax < height[i]) {
				rightMax = height[i];
				rightIndex = i;
			}
		}
		
		for(int i = 0; i < rightIndex; i++) {
			leftMax = Math.max(leftMax, height[i]);
			int water = Math.min(leftMax, rightMax) - height[i];
			totalWater += water;
		}
		
		leftMax = 0;
		
		for(int i = height.length - 1; i > rightIndex; i--) {
			leftMax = Math.max(leftMax, height[i]);
			int water = Math.min(leftMax, rightMax) - height[i];
			totalWater += water;
		}
		return totalWater;
	}
}
