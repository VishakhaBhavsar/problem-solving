package com.exxample.java;

import java.util.HashMap;
import java.util.PriorityQueue;

public class HighFive {

	public static void main(String[] args) {
		int[][] items = { {1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}};
		items = highFive(items);
		System.out.print("{");
		for (int i = 0; i < items.length; i++) {
			System.out.print("{" + items[i][0]);
			System.out.print(", " + items[i][1] + "}, ");
		}
		System.out.println("}");
	}
	
	public static int[][] highFive(int[][] items) {
		HashMap<Integer, int[]> map = new HashMap<>();
		
	}
}
