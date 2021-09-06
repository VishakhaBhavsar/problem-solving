package com.exxample.java;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrder {

	public static void main(String[] args) {
		
		int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		printMatrix(spiralOrder(matrix));
	}
	
	public static void printMatrix(List<Integer> matrix) {
		for(int i = 0; i < matrix.size(); i++) 
			System.out.print(" " + matrix.get(i));
	}
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> nums = new ArrayList<>();
		
		if(matrix == null || matrix.length == 0)
			return nums;
		
		int top = 0;
		int bottom = matrix.length - 1;
		int left = 0;
		int right = matrix[0].length - 1;
		int size = matrix.length * matrix[0].length;
		
		while(nums.size() < size) {
			for(int i = left; i <= right && nums.size() < size; i++) 
				nums.add(matrix[top][i]);
			top++;
			for(int i = top; i <= bottom && nums.size() < size; i++)
				nums.add(matrix[i][right]);
			right--;
			for(int i = right; i >= left && nums.size() < size; i--)
				nums.add(matrix[bottom][i]);
			bottom--;
			for(int i = bottom; i >= top && nums.size() < size; i--) 
				nums.add(matrix[i][left]);
			left++;
		}
		
		return nums;
	}
}
