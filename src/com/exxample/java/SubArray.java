package com.exxample.java;
public class SubArray {
	public static void main(String[] args) {
		int[] nums = {2,3,1,2,4,3};
		minSubArrayLen(7, nums);
	}
	public static int minSubArrayLen(int s, int[] nums) {
        int tmin = 0, sum = 0;
        for (int i = 0; i < nums.length-1; i++){
            int min = 1;
            sum = nums[i];
     
            if(sum >= s ){
            	if(min < tmin || i == 0)
                    tmin = min;
                break;
            }
            for(int j = i+1; j < nums.length; j++){
                sum += nums[j]; 
                min ++;
                if(sum >= s){
                    if(min < tmin || i == 0)
                        tmin = min;
                    break;
                }
            }
            System.out.println("i = " + i + " min = " + min + " tmin = " + tmin);
        }
        return tmin;
    }
}