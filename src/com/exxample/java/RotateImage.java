package com.exxample.java;

public class RotateImage {

	public static void main(String[] args) {
		int[][] matrix = new int[][] {
	        new int[] {1, 2, 3},
	        new int[] {4, 5, 6},
	        new int[] {7, 8, 9}
	    };
		rotateInPlace(matrix);
		System.out.print("{");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("{ ");
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] +" ");
			}
			System.out.print("},");
		}	
		System.out.print("}");
	}
	
	
	public static void rotateInPlace(int[][] matrix) {
		int n = matrix.length;
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < (n/2); j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-1-j];
				matrix[i][n-1-j] = temp;
			}
		}
	}

	/*
	 * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
		Output: [[7,4,1],[8,5,2],[9,6,3]]
		
		Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
		Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
	 */
	public static void rotate(int[][] matrix) {
		int num[][] = new int[matrix.length][matrix[0].length];
		int row = 0, col = 0;
		for (int i = matrix.length -1; i >= 0; i--) {
			for (int j = 0; j < matrix[i].length; j++) {
				num[row++][col] = matrix[i][j];
			}
			row = 0;
			col++;
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = num[i][j];
			}
		}
    }
}
