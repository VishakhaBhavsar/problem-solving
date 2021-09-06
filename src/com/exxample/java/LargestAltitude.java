package com.exxample.java;

public class LargestAltitude {

	public static void main(String[] args) {
		int[] gain = {-4,-3,-2,-1,4,3,2};
		System.out.println(largestAltitude(gain));

	}
	public static int largestAltitude(int[] gain) {
		int sum = 0;
        int max = 0;
        for(int i = 0; i < gain.length; i++){
            sum += gain[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}
