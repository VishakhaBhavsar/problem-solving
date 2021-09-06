package com.exxample.java;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearednNumber {
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		System.out.println(findDisappearedNumbers(nums));
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> newList = new ArrayList<Integer>(); 
        
        boolean[] counter = new boolean[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
			counter[nums[i]] = true;
		}
        for (int i = 0; i < counter.length; i++) {
        	System.out.print(counter[i]);
		}
       
        
        for (int i = 1; i < counter.length; i++) {
			if(!counter[i])
				newList.add(i);
		}
        return newList;
    }
}
