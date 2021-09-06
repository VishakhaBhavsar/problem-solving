package com.exxample.java;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {

	public static void main(String[] args) {
		int[][] interval = {{1,4},{0,2},{3,5}};
		int[][] output = merge(interval);
		System.out.print("{");
		for (int i = 0; i < output.length; i++) {
			System.out.print("{" + output[i][0] + ", " + output[i][1] + "} ");
		}
		System.out.print("}");
	}

	public static int[][] merge(int[][] intervals) {
		
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		LinkedList<int[]> merged = new LinkedList<int[]>();
		
		for(int[] interval: intervals) {
			if(merged.isEmpty() || merged.getLast()[1] < interval[0]) {
				merged.add(interval);
			}
			else {
				merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
			}
		}
		
		return merged.toArray(new int[merged.size()][]);
	}
}
