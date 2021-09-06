package com.exxample.java;

import java.util.ArrayList;
import java.util.List;

public class Permute {

	public static void main(String[] args) {
		System.out.println(permute(new int[] {1}));

	}
	
	public static List<List<Integer>> permute(int[] nums){
		List<List<Integer>> combinations = new ArrayList<>();
		boolean[] visited = new boolean[nums.length];
		
		backTracking(combinations, visited, nums, new ArrayList<Integer>());
		return combinations;
	}
	
	public static void backTracking(List<List<Integer>> combinations, boolean[] visited, int[] nums, ArrayList<Integer> current) {
		if(current.size() == nums.length) {
			combinations.add(new ArrayList<Integer>(current));
			return;
		}
		
		for(int i = 0; i < nums.length; i++) {
			if(visited[i] == true)
				continue;
			current.add(nums[i]);
			visited[i] = true;
			backTracking(combinations, visited, nums, current);
			current.remove(current.size() - 1);
			visited[i] = false;
		}
	}

}
