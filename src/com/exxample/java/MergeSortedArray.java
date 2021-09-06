package com.exxample.java;
import java.util.Arrays;
public class MergeSortedArray {
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		merge(nums1, 3, nums2, 3);
		for(int i = 0; i < nums1.length; i++) {
			System.out.print(" " + nums1[i]);
		}
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for(int i = m; i < nums1.length; i++){
            nums1[i] = nums2[j++];
        }
        Arrays.sort(nums1);
    }

}
