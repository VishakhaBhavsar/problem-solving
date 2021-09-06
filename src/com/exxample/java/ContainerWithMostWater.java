package com.exxample.java;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		int[] height = {1,2,1};
		System.out.println(maxArea(height));
	}
	
	public static int maxArea(int[] height) {
        int area = 0;
        int j = height.length - 1;
        int i = 0;
        while (i < j){
        	area = Math.max(area, Math.min(height[i], height[j]) * (j - i));
            if(height[i] > height[j])
            	j--;
            else 
                i++;   
        }
        return area;
    }
}