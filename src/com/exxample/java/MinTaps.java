package com.exxample.java;

public class MinTaps {

	public static void main(String[] args) {
	
		System.out.println(minTaps(8, new int[] {4,0,0,0,4,0,0,0,4}));
	}
	
	public static int minTaps(int n, int[] ranges) {
		int open = 0;
		int min = 0;
		int max = 0;
		
		while(max < n) {
			for(int i = 0; i < ranges.length; i++) {
				if(i - ranges[i] <= min && i + ranges[i] > max) {
					max = i + ranges[i];
				}
			}
			if(min == max) {
				return -1;
			} 
			open++;
			min = max;
		}
		
		return open;
	}

}
