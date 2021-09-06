package com.exxample.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class InterSectionTwoArray {

	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		int[] result = intersectionArraySort(nums1, nums2);
		System.out.print("{");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		System.out.print("}");

	}
	
	public static int[] intersectionArraySort(int[] nums1, int[] nums2) {
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		List<Integer> resultList = new ArrayList<Integer>();
		
		int i = 0, j = 0;
		
		while(i < nums1.length && j < nums2.length) {
			if(nums1[i] == nums2[j]) {
				resultList.add(nums1[i]);
				i++;
				j++;
			}
			else if (nums1[i] > nums2[j]) {
				j++;
			}
			else if(nums1[i] < nums2[j]) {
				i++;
			}
		}
		
		int[] result = new int[resultList.size()];
		
		for(int x = 0; x < resultList.size(); x++) {
			result[x] = resultList.get(x);
		}
		
		
		return result;
	}

}
