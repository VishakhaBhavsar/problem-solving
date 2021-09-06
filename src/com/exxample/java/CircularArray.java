package com.exxample.java;
public class CircularArray {
	public static void main(String[] args) {
		int[] code = {10,5,7,7,3,2,10,3,6,9,1,6};
		int[] copy = new int[2*code.length];
		System.arraycopy(code, 0, copy, 0, code.length);
		System.arraycopy(code, 0, copy, code.length, code.length );
		
		int result[] = new int[code.length];
		int k = -4;
		
		if(k == 0) {
			for (int i = 0; i < result.length; i++) {
				result[i] = 0;
			}
		}
		
		if (k > 0) {
			for(int i = 0; i < result.length; i++) {
				for (int j = i+1; j < k+1; j++) {
					result[i] += copy[j];
				}
				k++;
			}
		}
		
		if(k < 0) {
			//k = Math.abs(k);
			for(int i = 0; i < result.length; i++) {
				for(int j = code.length+i; j > code.length+k; j--) {
					result[i] += copy[j-1];
				}
			k++;
			}
		}
		 
		for (int i = 0; i < result.length; i++) {
			System.out.print(" " + result[i]);
		}
	}
}
	

