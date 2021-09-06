package com.exxample.java;

import java.util.HashMap;

public class CanFormArray {

	public static void main(String[] args) {
		int[] arr = {1,3,5,7};
		int[][] pieces = {{2,4,6,8}};	
		System.out.println(canFormArray(arr, pieces));
	}
	
	public static boolean canFormArray(int[] arr, int[][] pieces) {
        
        HashMap<Integer, int[]> map = new HashMap<>();
        for(int i = 0; i < pieces.length; i++)
            map.put(pieces[i][0], pieces[i]);
        int i = 0;
		while(i < arr.length) {
			if(!map.containsKey(arr[i])) 
				return false;
			else {
				  int[] list = map.get(arr[i]);
				  int len = list.length;
				  int j = 1;
				  i++; 
				  while(j < len && len > 1) {
					  if(list[j] != arr[i])
						  return false;
					  else {
						  i++; 
						  j++;
					  }
				  }
			}
		}
        return true;
	}
}
